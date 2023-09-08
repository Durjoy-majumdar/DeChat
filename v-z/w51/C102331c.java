package w51;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: w51.c */
public class C102331c {

    /* renamed from: a */
    public Context f301407a;

    /* renamed from: b */
    public String f301408b;

    /* renamed from: c */
    public View f301409c;

    /* renamed from: d */
    public ImageView f301410d;

    /* renamed from: e */
    public TextView f301411e;

    /* renamed from: f */
    public ImageView f301412f;

    public C102331c(Context context, int i) {
        this.f301407a = context;
        this.f301409c = C85868k2.m106137b(context).inflate(i, (ViewGroup) null);
        mo141895a();
    }

    /* renamed from: a */
    public final void mo141895a() {
        View view = this.f301409c;
        if (view == null) {
            Log.m105928w("MicroMsg.emoji.BaseEmojiStoreItemViewHolder", "initView failed. root is null.");
            return;
        }
        this.f301410d = (ImageView) view.findViewById(C0966R.C0970id.fak);
        this.f301411e = (TextView) this.f301409c.findViewById(C0966R.C0970id.f358474fc2);
        this.f301412f = (ImageView) this.f301409c.findViewById(C0966R.C0970id.faf);
    }

    public C102331c(Context context, View view) {
        this.f301407a = context;
        this.f301409c = view;
        mo141895a();
    }
}
