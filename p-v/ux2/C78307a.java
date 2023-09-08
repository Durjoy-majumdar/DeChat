package ux2;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import nj3.C76901s0;

/* renamed from: ux2.a */
public class C78307a {

    /* renamed from: a */
    public C76901s0 f229385a;

    /* renamed from: b */
    public Context f229386b;

    /* renamed from: c */
    public View f229387c = this.f229385a.getContentView().findViewById(C0966R.C0970id.lb_);

    /* renamed from: d */
    public View f229388d;

    /* renamed from: e */
    public View f229389e;

    /* renamed from: f */
    public View f229390f;

    /* renamed from: ux2.a$a */
    public class C78308a extends MMHandler {
        public C78308a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C78307a.this.f229385a.dismiss();
        }
    }

    public C78307a(Context context) {
        new C78308a();
        this.f229386b = context;
        BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 180.0f);
        C76901s0 s0Var = new C76901s0(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.cco, (ViewGroup) null), -1, -2);
        this.f229385a = s0Var;
        ImageView imageView = (ImageView) s0Var.getContentView().findViewById(C0966R.C0970id.lb7);
        TextView textView = (TextView) this.f229385a.getContentView().findViewById(C0966R.C0970id.lbb);
        ImageView imageView2 = (ImageView) this.f229385a.getContentView().findViewById(C0966R.C0970id.lba);
        this.f229388d = this.f229385a.getContentView().findViewById(C0966R.C0970id.lbc);
        this.f229389e = this.f229385a.getContentView().findViewById(C0966R.C0970id.lbd);
        this.f229390f = this.f229385a.getContentView().findViewById(C0966R.C0970id.lbe);
    }
}
