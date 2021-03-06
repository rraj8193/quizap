// Generated by view binder compiler. Do not edit!
package com.example.quizap.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.quizap.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScoreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView quizNameScore;

  @NonNull
  public final TextView scoreText;

  @NonNull
  public final TextView textView5;

  private ActivityScoreBinding(@NonNull ConstraintLayout rootView, @NonNull TextView quizNameScore,
      @NonNull TextView scoreText, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.quizNameScore = quizNameScore;
    this.scoreText = scoreText;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_score, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.quizNameScore;
      TextView quizNameScore = rootView.findViewById(id);
      if (quizNameScore == null) {
        break missingId;
      }

      id = R.id.scoreText;
      TextView scoreText = rootView.findViewById(id);
      if (scoreText == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityScoreBinding((ConstraintLayout) rootView, quizNameScore, scoreText,
          textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
