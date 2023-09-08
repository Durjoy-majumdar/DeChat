package jl0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import kg3.C76577a;
import p910lj.C76701a;

/* renamed from: jl0.a */
public class C9460a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f29530d;

    /* renamed from: jl0.a$a */
    public class C9461a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f29531d;

        public C9461a(TextView textView) {
            this.f29531d = textView;
        }

        public void onGlobalLayout() {
            if (this.f29531d.getLineCount() > 1) {
                this.f29531d.setTextSize(0, (float) C76577a.m92157h(C9460a.this.f29530d, C0966R.dimen.f3684bd));
            }
            this.f29531d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public C9460a(Context context) {
        this.f29530d = context;
    }

    public void run() {
        Toast makeText = C76701a.makeText(this.f29530d, (CharSequence) "", 3000);
        View inflate = View.inflate(this.f29530d, C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_outlined_colorful_handoff_success);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        textView.setText(this.f29530d.getString(C0966R.string.a6n));
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C9461a(textView));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }
}
