// Generated by view binder compiler. Do not edit!
package com.gtechyderabad.gtec.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gtechyderabad.gtec.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactUsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView textContactUs;

  @NonNull
  public final Toolbar toolbar;

  private ActivityContactUsBinding(@NonNull ScrollView rootView, @NonNull TextView textContactUs,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.textContactUs = textContactUs;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactUsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact_us, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactUsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_contact_us;
      TextView textContactUs = ViewBindings.findChildViewById(rootView, id);
      if (textContactUs == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityContactUsBinding((ScrollView) rootView, textContactUs, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
