package com.example.getIt.user.DTO;


import com.example.getIt.product.DTO.ProductDTO;
import com.example.getIt.product.entity.ReviewEntity;
import com.example.getIt.util.Role;
import lombok.*;

import java.util.List;

@NoArgsConstructor
public class UserDTO {
    @Setter
    @Getter
    @AllArgsConstructor
    @Builder
    public static class User{
        private Long userIdx;
        private String email;
        private String password;
        private String nickName;
        private Integer birthday;
        private String job;
        private String status;
        private Role role;
        private List<ProductDTO.GetProduct> likeProduct;
        public User(){}

    }

    @Setter
    @Getter
    @AllArgsConstructor
    @Builder
    public static class UserProtected{
        private Long userIdx;
        private String email;
        private String nickName;
        private Integer birthday;
        private String job;
        private String status;
        private Role role;
        private List<ProductDTO.GetProduct> likeProduct;
        private List<UserReviewList> review;
        public UserProtected(){}

    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class PostUserRes {
        private String jwt;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class UserPwd {
        private String password;
        private String newPassword;
    }
    @Setter
    @Getter
    @AllArgsConstructor
    public static class UserLikeList{
        private Long userIdx;
        private List<ProductDTO.GetProduct> likeProduct;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserReviewList{
        private Long userIdx;
        private String review;
        private String reviewImgUrl;
        private ProductDTO.GetProduct reviewList;
    }
}
