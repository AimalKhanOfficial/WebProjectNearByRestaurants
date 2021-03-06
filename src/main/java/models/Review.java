package models;

import java.io.Serializable;

public class Review implements Serializable {
    private String reviewId;
    private String restaurantId;
    private String reviewText;
    private String dateTime;
    private int userId;

    public Review(String reviewId, String restaurantId, String reviewText, String dateTime, int userId) {
        this.reviewId = reviewId;
        this.restaurantId = restaurantId;
        this.reviewText = reviewText;
        this.dateTime = dateTime;
        this.userId = userId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Review [" +
                "restaurantId=" + this.restaurantId + ", " +
                "reviewText=" + this.reviewText+
                "dateTime=" + this.dateTime+
                "userId=" + this.userId+
                "]";
    }
}
