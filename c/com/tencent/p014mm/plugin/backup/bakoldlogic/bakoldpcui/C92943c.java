package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import mv0.C99980a;
import mv0.C99990k;
import xd3.C78802b;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.c */
public class C92943c extends C78802b implements C99990k.C99994d {

    /* renamed from: h */
    public int f267697h = -1;

    /* renamed from: i */
    public int f267698i = 0;

    /* renamed from: j */
    public View f267699j = null;

    /* renamed from: n */
    public MMHandler f267700n = new MMHandler(Looper.getMainLooper());

    /* renamed from: o */
    public IListener f267701o;

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.c$a */
    public class C92944a implements Runnable {
        public C92944a() {
        }

        public void run() {
            C92943c.this.mo7970e();
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.c$b */
    public class C92945b implements Runnable {
        public C92945b() {
        }

        public void run() {
            C92943c.this.mo7970e();
        }
    }

    public C92943c(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.a4s);
            this.f267699j = findViewById;
            findViewById.setOnClickListener(new C92942b(this));
        }
        mo7970e();
        BakChatBanner$1 bakChatBanner$1 = new BakChatBanner$1(this, C40008f.f107254d);
        this.f267701o = bakChatBanner$1;
        bakChatBanner$1.alive();
    }

    /* renamed from: P */
    public void mo127335P() {
    }

    /* renamed from: W2 */
    public void mo127336W2() {
        Log.m105919d("MicroMsg.BakChatBanner", "onNetFinish PCBannerStatus:%d", Integer.valueOf(C99980a.m130643h().mo139322k().f292969q));
        C99980a.m130643h().mo139322k().mo139333g(17);
        this.f267700n.post(new C92945b());
    }

    /* renamed from: a */
    public void mo7968a() {
        Log.m105924i("MicroMsg.BakChatBanner", "destroy");
        mo7971f();
        this.f267701o.dead();
    }

    /* renamed from: a2 */
    public void mo127337a2() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6545ht;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 3;
    }

    /* renamed from: d */
    public void mo127331d(int i) {
    }

    /* renamed from: e */
    public boolean mo7970e() {
        this.f267698i = C99980a.m130643h().mo139322k().mo139331d();
        C99980a.m130643h().mo139322k().mo139336j(this);
        return mo127358h(true);
    }

    /* renamed from: f */
    public void mo7971f() {
        this.f267697h = -1;
        C99990k k = C99980a.m130643h().mo139322k();
        synchronized (k) {
            k.f292961f = null;
            k.f292963h.f292947j = null;
            k.f292964i.f292980o = null;
        }
    }

    /* renamed from: h */
    public final boolean mo127358h(boolean z) {
        boolean z2;
        int i = C99980a.m130643h().mo139322k().f292969q;
        this.f267697h = i;
        Log.m105919d("MicroMsg.BakChatBanner", "dealwithPCBakBanner PCBannerStatus:%d, setStrategyCaller:%b", Integer.valueOf(i), Boolean.valueOf(z));
        int i2 = this.f267697h;
        if (i2 < 2 || i2 > 6) {
            View view = this.f267699j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner", "dealwithPCBakBanner", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner", "dealwithPCBakBanner", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return false;
        }
        View view3 = this.f267699j;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner", "dealwithPCBakBanner", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner", "dealwithPCBakBanner", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z) {
            C99990k k = C99980a.m130643h().mo139322k();
            synchronized (k) {
                try {
                    z2 = k.f292971s;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z2) {
                C99980a.m130643h().mo139322k().mo139336j(this);
            }
        }
        int i3 = this.f267697h;
        if (2 == i3) {
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageResource(C0966R.raw.chatting_backup_computer);
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aeq, new Object[]{Integer.valueOf(this.f267698i)}));
        } else if (3 == i3) {
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageResource(C0966R.raw.chatting_backup_computer);
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aet, new Object[]{Integer.valueOf(this.f267698i)}));
        } else if (4 == i3) {
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aes));
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageResource(C0966R.raw.chatting_backup_comfirm);
        } else if (5 == i3) {
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageResource(C0966R.raw.chatting_backup_computer);
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aeo, new Object[]{Integer.valueOf(this.f267698i)}));
        } else if (6 == i3) {
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aer));
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageResource(C0966R.raw.chatting_backup_comfirm);
        }
        return true;
    }

    /* renamed from: m4 */
    public void mo127338m4(int i) {
        Log.m105919d("MicroMsg.BakChatBanner", "onMergeProgress PCBannerStatus:%d, percent:%d", Integer.valueOf(C99980a.m130643h().mo139322k().f292969q), Integer.valueOf(i));
    }

    /* renamed from: o1 */
    public void mo127339o1(int i) {
        Log.m105919d("MicroMsg.BakChatBanner", "onNetProgress PCBannerStatus:%d, percent:%d", Integer.valueOf(C99980a.m130643h().mo139322k().f292969q), Integer.valueOf(i));
        this.f267698i = i;
        this.f267700n.post(new C92944a());
    }
}
