// Generated by view binder compiler. Do not edit!
package com.gtechyderabad.yourfood_delivery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gtechyderabad.yourfood_delivery.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addToCart;

  @NonNull
  public final TextView bottomDes;

  @NonNull
  public final RoundedImageView bottomImg;

  @NonNull
  public final TextView bottomName;

  @NonNull
  public final TextView bottomPrice;

  @NonNull
  public final TextView bottomRating;

  @NonNull
  public final ConstraintLayout bottomSheet;

  @NonNull
  public final TextView bottomTiming;

  @NonNull
  public final ImageView imgDailyItem;

  @NonNull
  public final TextView txtBottomSheet;

  @NonNull
  public final View view;

  private BottomSheetLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull Button addToCart,
      @NonNull TextView bottomDes, @NonNull RoundedImageView bottomImg,
      @NonNull TextView bottomName, @NonNull TextView bottomPrice, @NonNull TextView bottomRating,
      @NonNull ConstraintLayout bottomSheet, @NonNull TextView bottomTiming,
      @NonNull ImageView imgDailyItem, @NonNull TextView txtBottomSheet, @NonNull View view) {
    this.rootView = rootView;
    this.addToCart = addToCart;
    this.bottomDes = bottomDes;
    this.bottomImg = bottomImg;
    this.bottomName = bottomName;
    this.bottomPrice = bottomPrice;
    this.bottomRating = bottomRating;
    this.bottomSheet = bottomSheet;
    this.bottomTiming = bottomTiming;
    this.imgDailyItem = imgDailyItem;
    this.txtBottomSheet = txtBottomSheet;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_to_cart;
      Button addToCart = ViewBindings.findChildViewById(rootView, id);
      if (addToCart == null) {
        break missingId;
      }

      id = R.id.bottom_des;
      TextView bottomDes = ViewBindings.findChildViewById(rootView, id);
      if (bottomDes == null) {
        break missingId;
      }

      id = R.id.bottom_img;
      RoundedImageView bottomImg = ViewBindings.findChildViewById(rootView, id);
      if (bottomImg == null) {
        break missingId;
      }

      id = R.id.bottom_name;
      TextView bottomName = ViewBindings.findChildViewById(rootView, id);
      if (bottomName == null) {
        break missingId;
      }

      id = R.id.bottom_price;
      TextView bottomPrice = ViewBindings.findChildViewById(rootView, id);
      if (bottomPrice == null) {
        break missingId;
      }

      id = R.id.bottom_rating;
      TextView bottomRating = ViewBindings.findChildViewById(rootView, id);
      if (bottomRating == null) {
        break missingId;
      }

      ConstraintLayout bottomSheet = (ConstraintLayout) rootView;

      id = R.id.bottom_timing;
      TextView bottomTiming = ViewBindings.findChildViewById(rootView, id);
      if (bottomTiming == null) {
        break missingId;
      }

      id = R.id.img_daily_item;
      ImageView imgDailyItem = ViewBindings.findChildViewById(rootView, id);
      if (imgDailyItem == null) {
        break missingId;
      }

      id = R.id.txt_bottom_sheet;
      TextView txtBottomSheet = ViewBindings.findChildViewById(rootView, id);
      if (txtBottomSheet == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new BottomSheetLayoutBinding((ConstraintLayout) rootView, addToCart, bottomDes,
          bottomImg, bottomName, bottomPrice, bottomRating, bottomSheet, bottomTiming, imgDailyItem,
          txtBottomSheet, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
