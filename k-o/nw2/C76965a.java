package nw2;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentInputView;
import gy3.C87412m;

/* renamed from: nw2.a */
public final class C76965a extends C103422m {

    /* renamed from: f */
    public StoryCommentInputView f224892f;

    /* renamed from: g */
    public final ViewGroup.LayoutParams f224893g = new ViewGroup.LayoutParams(-1, -1);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76965a(Context context) {
        super(context, C0966R.style.f8413hk);
        C87412m.m108594g(context, "context");
        this.f224892f = new StoryCommentInputView(context, (AttributeSet) null);
        mo143460C(1);
    }

    public void onBackPressed() {
        this.f224892f.getClass();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        setContentView(this.f224892f, this.f224893g);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(36);
        }
    }

    public void onStart() {
        super.onStart();
        this.f224892f.requestFocus();
    }
}
