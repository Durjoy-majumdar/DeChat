package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import ky2.C10432i;
import p196ln.C76706g;
import p248ug.C52570c0;
import rb0.C47976j;
import rb0.C48009v0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView */
public class BizContactEntranceView extends RelativeLayout {

    /* renamed from: d */
    public Context f218454d;

    /* renamed from: e */
    public View f218455e = null;

    /* renamed from: f */
    public View f218456f;

    /* renamed from: g */
    public TextView f218457g;

    /* renamed from: h */
    public LinearLayout f218458h;

    /* renamed from: i */
    public boolean f218459i = true;

    /* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView$a */
    public class C74364a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView$a$a */
        public class C74365a implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ View f218461d;

            public C74365a(View view) {
                this.f218461d = view;
            }

            public Object invoke(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                BizContactEntranceView.m88812a(BizContactEntranceView.this, this.f218461d);
                return null;
            }
        }

        public C74364a() {
        }

        public void onClick(View view) {
            Class cls = C45696d.class;
            Class cls2 = C52570c0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!WeChatBrands.Business.Entries.ContactOa.checkAvailable(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (((C52570c0) C86709a0.m107533q(cls2)).mo58178H1()) {
                ((C10432i) C86312j.m106911c(C10432i.class)).mo10755m4(BizContactEntranceView.this.f218454d);
                ((C52570c0) C86709a0.m107533q(cls2)).mo58184vU(8, "");
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                if (!((C45696d) C86709a0.m107533q(cls)).mo70993g3()) {
                    ((C45696d) C86709a0.m107533q(cls)).Bw0(view.getContext(), new C74365a(view));
                } else {
                    BizContactEntranceView.m88812a(BizContactEntranceView.this, view);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView$b */
    public class C74366b implements View.OnTouchListener {
        public C74366b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/BizContactEntranceView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Context context = BizContactEntranceView.this.f218454d;
            if (context instanceof MMActivity) {
                ((MMActivity) context).hideVKB();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/BizContactEntranceView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView$c */
    public class C74367c implements Runnable {

        /* renamed from: com.tencent.mm.ui.contact.BizContactEntranceView$c$a */
        public class C74368a implements Runnable {
            public C74368a(long j, long j2) {
            }

            public void run() {
                BizContactEntranceView bizContactEntranceView = BizContactEntranceView.this;
                TextView textView = bizContactEntranceView.f218457g;
                bizContactEntranceView.getClass();
                textView.setVisibility(4);
            }
        }

        public C74367c() {
        }

        public void run() {
            long j;
            C47976j Fx0 = C48009v0.Fx0();
            Fx0.getClass();
            Log.m105925i("MicroMsg.BizInfoStorage", "getLastNewBizUpdateTime, sql %s", "select updateTime from BizInfo where type = 1 and status = 1 ORDER BY updateTime DESC");
            Cursor rawQuery = Fx0.rawQuery("select updateTime from BizInfo where type = 1 and status = 1 ORDER BY updateTime DESC", new String[0]);
            if (rawQuery != null) {
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                } else {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    j = j2;
                    long nullAsLong = Util.nullAsLong(C97625j3.m125812b().mo105906u().mo119684e(233473, (Object) null), 0);
                    Log.m105925i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", Long.valueOf(j), Long.valueOf(nullAsLong));
                    MMHandlerThread.postToMainThread(new C74368a(j, nullAsLong));
                }
            }
            j = 0;
            long nullAsLong2 = Util.nullAsLong(C97625j3.m125812b().mo105906u().mo119684e(233473, (Object) null), 0);
            Log.m105925i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", Long.valueOf(j), Long.valueOf(nullAsLong2));
            MMHandlerThread.postToMainThread(new C74368a(j, nullAsLong2));
        }
    }

    public BizContactEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f218454d = context;
        mo103319b();
        mo103320c();
    }

    /* renamed from: a */
    public static void m88812a(BizContactEntranceView bizContactEntranceView, View view) {
        bizContactEntranceView.getClass();
        Intent intent = new Intent();
        intent.putExtra("intent_service_type", 251658241);
        C88144b.m109791i(view.getContext(), "brandservice", ".ui.BrandServiceIndexUI", intent, (Bundle) null);
    }

    /* renamed from: b */
    public final void mo103319b() {
        View.inflate(getContext(), C0966R.C0971layout.f6588j2, this);
        View findViewById = findViewById(C0966R.C0970id.f357785br0);
        this.f218455e = findViewById;
        this.f218456f = findViewById.findViewById(C0966R.C0970id.a_u);
        this.f218458h = (LinearLayout) this.f218455e.findViewById(C0966R.C0970id.aev);
        ViewGroup.LayoutParams layoutParams = this.f218456f.getLayoutParams();
        layoutParams.height = (int) (((float) C76577a.m92155f(getContext(), C0966R.dimen.f3669az)) * C76577a.m92175z(getContext()));
        this.f218456f.setLayoutParams(layoutParams);
        this.f218455e.setOnClickListener(new C74364a());
        this.f218456f.setOnTouchListener(new C74366b());
        MaskLayout maskLayout = (MaskLayout) this.f218456f.findViewById(C0966R.C0970id.a_t);
        ((ImageView) maskLayout.getContentView()).setImageBitmap(((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93563l("service_officialaccounts"));
        this.f218457g = (TextView) maskLayout.findViewById(C0966R.C0970id.kmv);
    }

    /* renamed from: c */
    public final void mo103320c() {
        long currentTimeMillis = System.currentTimeMillis();
        int R3 = C97625j3.m125812b().mo105907v().mo69669R3();
        if (R3 > 0) {
            this.f218459i = true;
        } else {
            this.f218459i = false;
        }
        View view = this.f218456f;
        int i = this.f218459i ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/BizContactEntranceView", "setStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/contact/BizContactEntranceView", "setStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f218459i) {
            C86709a0.m107525e().postToWorker(new C74367c());
        }
        Log.m105925i("MicroMsg.BizContactEntranceView", "biz contact Count %d, isEntranceShow %s, setStatus cost %d", Integer.valueOf(R3), Boolean.valueOf(this.f218459i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: d */
    public void mo103321d(boolean z) {
        View view = this.f218456f;
        if (view != null && this.f218458h != null) {
            if (z) {
                int paddingLeft = view.getPaddingLeft();
                this.f218456f.setBackground(C74942w4.m89785b(this.f218454d, C0966R.attr.f2868u6));
                this.f218456f.setPadding(paddingLeft, 0, 0, 0);
                this.f218458h.setBackground((Drawable) null);
                return;
            }
            view.setBackground((Drawable) null);
            this.f218458h.setBackground(C74942w4.m89785b(this.f218454d, C0966R.attr.f2868u6));
        }
    }

    public void setVisible(boolean z) {
        Log.m105925i("MicroMsg.BizContactEntranceView", "setVisible visible = %s, isEntranceShow = %s", Boolean.valueOf(z), Boolean.valueOf(this.f218459i));
        View view = this.f218455e;
        int i = (!z || !this.f218459i) ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/BizContactEntranceView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/contact/BizContactEntranceView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public BizContactEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f218454d = context;
        mo103319b();
        mo103320c();
    }

    public BizContactEntranceView(Context context) {
        super(context);
        this.f218454d = context;
        mo103319b();
        mo103320c();
    }
}
