package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.conversation.banner.C74666h;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75598w3;
import xd3.C78801a;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.q */
public class C74673q extends C78802b {

    /* renamed from: h */
    public LinearLayout f219538h = null;

    /* renamed from: com.tencent.mm.ui.conversation.banner.q$a */
    public class C74674a implements C75598w3.C75600b {

        /* renamed from: a */
        public final /* synthetic */ Context f219539a;

        /* renamed from: com.tencent.mm.ui.conversation.banner.q$a$a */
        public class C74675a implements Runnable {
            public C74675a() {
            }

            public void run() {
                LinearLayout linearLayout = C74673q.this.f219538h;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    C74673q.this.f219538h.removeAllViews();
                }
                C78801a a = C74666h.m89417a(C74674a.this.f219539a, C74666h.C74667a.MAIN_FRAME_BANNER, (Object[]) null);
                if (a != null && a.getView() != null) {
                    Log.m105925i("MicroMsg.MainFrameAndAbtestBanner", "summerinit MainFrameBannerStorage onNotify banner[%s], view[%s]", a, a.getView());
                    C74673q.this.f219538h.setVisibility(0);
                    C74673q.this.f219538h.addView(a.getView(), new LinearLayout.LayoutParams(-1, -2));
                }
            }
        }

        public C74674a(Context context) {
            this.f219539a = context;
        }

        /* renamed from: a */
        public void mo103832a() {
            C74673q.this.f219538h.post(new C74675a());
        }
    }

    public C74673q(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f219538h = linearLayout;
        linearLayout.setVisibility(8);
        C75598w3.m90816e().f222085a = new C74674a(context);
        ((C74674a) C75598w3.m90816e().f222085a).mo103832a();
    }

    /* renamed from: a */
    public void mo7968a() {
        C75598w3.m90816e().f222085a = null;
    }

    /* renamed from: b */
    public int mo7969b() {
        return -1;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        LinearLayout linearLayout = this.f219538h;
        return linearLayout != null && linearLayout.getVisibility() == 0;
    }

    public View getView() {
        return this.f219538h;
    }
}
