// Generated by view binder compiler. Do not edit!
package com.gtechyderabad.yourfood_delivery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gtechyderabad.yourfood_delivery.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTrackLocationBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button btnCallDriver;

  @NonNull
  public final LinearLayout deliveryDetailsPanel;

  @NonNull
  public final FloatingActionButton fabRecenter;

  @NonNull
  public final FrameLayout mapContainer;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvDriverName;

  @NonNull
  public final TextView tvETA;

  private ActivityTrackLocationBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Button btnCallDriver, @NonNull LinearLayout deliveryDetailsPanel,
      @NonNull FloatingActionButton fabRecenter, @NonNull FrameLayout mapContainer,
      @NonNull Toolbar toolbar, @NonNull TextView tvDriverName, @NonNull TextView tvETA) {
    this.rootView = rootView;
    this.btnCallDriver = btnCallDriver;
    this.deliveryDetailsPanel = deliveryDetailsPanel;
    this.fabRecenter = fabRecenter;
    this.mapContainer = mapContainer;
    this.toolbar = toolbar;
    this.tvDriverName = tvDriverName;
    this.tvETA = tvETA;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTrackLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTrackLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_track_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTrackLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCallDriver;
      Button btnCallDriver = ViewBindings.findChildViewById(rootView, id);
      if (btnCallDriver == null) {
        break missingId;
      }

      id = R.id.delivery_details_panel;
      LinearLayout deliveryDetailsPanel = ViewBindings.findChildViewById(rootView, id);
      if (deliveryDetailsPanel == null) {
        break missingId;
      }

      id = R.id.fabRecenter;
      FloatingActionButton fabRecenter = ViewBindings.findChildViewById(rootView, id);
      if (fabRecenter == null) {
        break missingId;
      }

      id = R.id.map_container;
      FrameLayout mapContainer = ViewBindings.findChildViewById(rootView, id);
      if (mapContainer == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvDriverName;
      TextView tvDriverName = ViewBindings.findChildViewById(rootView, id);
      if (tvDriverName == null) {
        break missingId;
      }

      id = R.id.tvETA;
      TextView tvETA = ViewBindings.findChildViewById(rootView, id);
      if (tvETA == null) {
        break missingId;
      }

      return new ActivityTrackLocationBinding((CoordinatorLayout) rootView, btnCallDriver,
          deliveryDetailsPanel, fabRecenter, mapContainer, toolbar, tvDriverName, tvETA);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
