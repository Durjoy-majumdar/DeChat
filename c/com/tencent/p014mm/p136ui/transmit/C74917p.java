package com.tencent.p014mm.p136ui.transmit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.transmit.p */
public class C74917p extends Dialog {

    /* renamed from: d */
    public C74919b f220284d = null;

    /* renamed from: e */
    public Context f220285e;

    /* renamed from: f */
    public LinearLayout f220286f;

    /* renamed from: g */
    public Button f220287g;

    /* renamed from: com.tencent.mm.ui.transmit.p$a */
    public class C74918a implements Runnable {
        public C74918a() {
        }

        public void run() {
            C74917p.this.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.p$b */
    public interface C74919b {
        /* renamed from: a */
        void mo103253a();
    }

    public C74917p(Context context) {
        super(context, C0966R.style.a66);
        this.f220285e = context;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, C0966R.C0971layout.c_w, (ViewGroup) null);
        this.f220286f = linearLayout;
        this.f220287g = (Button) linearLayout.findViewById(C0966R.C0970id.kq9);
        ImageView imageView = (ImageView) this.f220286f.findViewById(C0966R.C0970id.kq4);
        if (LocaleUtil.isChineseAppLang()) {
            imageView.setImageResource(C0966R.C0969drawable.cdh);
        } else {
            imageView.setImageResource(C0966R.C0969drawable.cdi);
        }
        this.f220287g.setOnClickListener(new C74916o(this));
    }

    /* renamed from: a */
    public static void m89752a(Context context, C74919b bVar) {
        C74917p pVar = new C74917p(context);
        pVar.f220284d = bVar;
        pVar.setCancelable(false);
        pVar.show();
    }

    public void dismiss() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new C74918a());
            Log.m105920e("MicroMsg.grouptodo.TodoIntroduceView", "dialog dismiss error!");
            return;
        }
        try {
            Context context = this.f220285e;
            if (context == null || !(context instanceof Activity)) {
                super.dismiss();
            } else if (!((Activity) context).isFinishing()) {
                super.dismiss();
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.grouptodo.TodoIntroduceView", "dismiss exception, e = " + e.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f220286f);
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.grouptodo.TodoIntroduceView", "%s:%s", e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
