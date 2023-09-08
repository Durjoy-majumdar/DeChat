package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.text.format.Time;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44697a0;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.C44947a1;
import com.tencent.p014mm.p136ui.conversation.C45003s;
import com.tencent.p014mm.p136ui.conversation.presenter.BaseBizConversationUI;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.platformtools.C72714e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import d62.C7250m;
import eb0.C45628s0;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import ml3.C47058a;
import ml3.C47067f;
import ml3.C47077m;
import ml3.C47079n;
import rb0.C47969h;
import rb0.C47971i;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48329b;
import sj3.C48395b;
import te3.C51801w9;
import wc3.C78538u;

/* renamed from: com.tencent.mm.ui.conversation.EnterpriseConversationUI */
public class EnterpriseConversationUI extends BaseBizConversationUI {

    /* renamed from: e */
    public View f121785e;

    /* renamed from: com.tencent.mm.ui.conversation.EnterpriseConversationUI$EnterpriseConversationFmUI */
    public static class EnterpriseConversationFmUI extends BaseConversationUI.BaseConversationFmUI implements MStorageEx.IOnStorageChange {

        /* renamed from: d */
        public String f121786d;

        /* renamed from: e */
        public LinearLayout f121787e = null;

        /* renamed from: f */
        public View f121788f = null;

        /* renamed from: g */
        public TextView f121789g;

        /* renamed from: h */
        public ListView f121790h;

        /* renamed from: i */
        public C44947a1 f121791i;

        /* renamed from: j */
        public String f121792j = null;

        /* renamed from: n */
        public String f121793n;

        /* renamed from: o */
        public int f121794o = 0;

        /* renamed from: p */
        public MMHandler f121795p;

        /* renamed from: q */
        public long f121796q = 0;

        /* renamed from: r */
        public long f121797r = 0;

        /* renamed from: s */
        public int f121798s = -2;

        /* renamed from: t */
        public long f121799t = 0;

        /* renamed from: u */
        public String f121800u = null;

        /* renamed from: v */
        public int f121801v;

        /* renamed from: w */
        public C47058a f121802w;

        /* renamed from: x */
        public C47077m f121803x;

        /* renamed from: y */
        public C47971i.C47973b f121804y = new C44907a();

        /* renamed from: com.tencent.mm.ui.conversation.EnterpriseConversationUI$EnterpriseConversationFmUI$a */
        public class C44907a implements C47971i.C47973b {
            public C44907a() {
            }

            /* renamed from: a */
            public void mo69971a(C47971i.C47973b.C47974a aVar) {
                if (aVar != null && !Util.isNullOrNil(aVar.f128680a) && aVar.f128680a.equals(EnterpriseConversationFmUI.this.f121793n)) {
                    EnterpriseConversationFmUI enterpriseConversationFmUI = EnterpriseConversationFmUI.this;
                    int i = enterpriseConversationFmUI.f121794o;
                    enterpriseConversationFmUI.f121794o = C44697a0.m49439a(enterpriseConversationFmUI.getContext(), EnterpriseConversationFmUI.this.f121793n);
                    EnterpriseConversationFmUI enterpriseConversationFmUI2 = EnterpriseConversationFmUI.this;
                    if (enterpriseConversationFmUI2.f121794o != i) {
                        enterpriseConversationFmUI2.mo70202L();
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.EnterpriseConversationUI$EnterpriseConversationFmUI$b */
        public class C44908b implements View.OnClickListener {
            public C44908b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C44697a0.m49440b(EnterpriseConversationFmUI.this.getContext(), EnterpriseConversationFmUI.this.f121793n, 3);
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: K */
        public static C47079n m49786K(EnterpriseConversationFmUI enterpriseConversationFmUI, C44947a1.C44951d dVar) {
            enterpriseConversationFmUI.getClass();
            if (dVar == null) {
                return null;
            }
            int i = dVar.f121940a;
            if (i == 0 && dVar.f121943d != null) {
                if (enterpriseConversationFmUI.f121802w == null) {
                    enterpriseConversationFmUI.f121802w = new C47058a(enterpriseConversationFmUI.f219287ui, new C45013v(enterpriseConversationFmUI));
                }
                return enterpriseConversationFmUI.f121802w;
            } else if (i != 1 || dVar.f121942c == null) {
                return null;
            } else {
                if (enterpriseConversationFmUI.f121803x == null) {
                    enterpriseConversationFmUI.f121803x = new C47077m(enterpriseConversationFmUI.f219287ui, enterpriseConversationFmUI.f121793n);
                }
                return enterpriseConversationFmUI.f121803x;
            }
        }

        /* renamed from: L */
        public final void mo70202L() {
            int a = C44697a0.m49439a(getContext(), this.f121793n);
            this.f121794o = a;
            if (a == 2 && this.f121787e == null) {
                LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ag_);
                this.f121787e = linearLayout;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = C76577a.m92157h(getContext(), C0966R.dimen.f3683bc);
                this.f121787e.setLayoutParams(layoutParams);
                this.f121788f = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a3t, this.f121787e, false);
                float p = C76577a.m92165p(getContext());
                CdnImageView cdnImageView = (CdnImageView) this.f121788f.findViewById(C0966R.C0970id.f2a);
                int i = (int) (p * ((float) cdnImageView.getLayoutParams().height));
                cdnImageView.getLayoutParams().height = i;
                cdnImageView.getLayoutParams().width = i;
                cdnImageView.requestLayout();
                TextView textView = (TextView) this.f121788f.findViewById(C0966R.C0970id.kpm);
                C47971i Ex0 = C48009v0.Ex0();
                C48009v0.Ex0();
                String Lo = Ex0.mo72743Lo(0);
                if (Lo == null || Lo.length() <= 0) {
                    textView.setText(C0966R.string.cbf);
                } else {
                    textView.setText(Lo);
                }
                int qq = C48009v0.Ex0().mo72751qq();
                if (qq != 0) {
                    textView.setTextColor(qq);
                }
                C48009v0.Ex0().getClass();
                if (C47971i.f128677g == null) {
                    C47971i.f128677g = new C51801w9();
                }
                String str = C47971i.f128677g.f143930g;
                if (str != null && str.length() > 0) {
                    cdnImageView.setUrl(str);
                }
                C44697a0.m49443e(this.f121793n, 1, 2);
                this.f121787e.addView(this.f121788f);
                this.f121788f.setOnClickListener(new C44908b());
                Activity context = getContext();
                String str2 = this.f121793n;
                if (C72688j0.m85020f(context, "com.tencent.wework")) {
                    C44697a0.m49444f(str2, 4, 3);
                } else {
                    C44697a0.m49444f(str2, 5, 3);
                }
                C44697a0.m49442d(getContext(), this.f121793n);
            }
            LinearLayout linearLayout2 = this.f121787e;
            if (linearLayout2 == null) {
                return;
            }
            if (this.f121794o == 2) {
                linearLayout2.setVisibility(0);
                C47969h jo = C48009v0.Ex0().mo72749jo(this.f121793n);
                int i2 = jo != null ? jo.field_qyUin : 0;
                int i3 = jo != null ? jo.field_userUin : 0;
                long j = 0;
                long j2 = jo != null ? jo.field_wwCorpId : 0;
                if (jo != null) {
                    j = jo.field_wwUserVid;
                }
                C115669n.INSTANCE.mo160131h(13656, Integer.valueOf(i2), Integer.valueOf(i3), 6, 3, Long.valueOf(j2), Long.valueOf(j));
                Log.m105919d("MicroMsg.EnterpriseConversationUI", "expose wework btn on session list  report: %s,%s,%s,%s,%s,%s", Integer.valueOf(i2), Integer.valueOf(i3), 6, 3, Long.valueOf(j2), Long.valueOf(j));
                return;
            }
            linearLayout2.setVisibility(8);
        }

        public int getLayoutId() {
            return C0966R.C0971layout.a3s;
        }

        public String getUserName() {
            return this.f121793n;
        }

        public void onActivityCreated(Bundle bundle) {
            super.onActivityCreated(bundle);
            this.f121793n = thisActivity().getIntent().getStringExtra("enterprise_biz_name");
            this.f121786d = thisActivity().getIntent().getStringExtra("enterprise_biz_display_name");
            this.f121801v = thisActivity().getIntent().getIntExtra("enterprise_from_scene", 5);
            setMMTitle(this.f121786d);
            this.f121790h = (ListView) findViewById(C0966R.C0970id.kpr);
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
            this.f121789g = textView;
            textView.setText(C0966R.string.f360381cb2);
            setBackBtn(new C45021z(this));
            setToTop(new C6951a0(this));
            if (C47984k.m53328b(this.f121793n) != null) {
                mo70202L();
                if (this.f121793n != null) {
                    C48009v0.Ex0().mo72745SE(this.f121793n, new C44953b0(this));
                    Log.m105921e("MicroMsg.EnterpriseConversationUI", "update father attr from svr bizName:%s", this.f121793n);
                } else {
                    Log.m105920e("MicroMsg.EnterpriseConversationUI", "bizName is null!!!");
                }
                addIconOptionMenu(1, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C44962c0(this));
                addIconOptionMenu(2, (int) C0966R.string.f7374ee, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C47067f(this.f219287ui, this.f121793n));
                C44947a1 a1Var = new C44947a1(thisActivity(), this.f121793n, new C44982d0(this));
                this.f121791i = a1Var;
                a1Var.f121935q.getClass();
                a1Var.f121936r.getClass();
                C44947a1 a1Var2 = this.f121791i;
                a1Var2.f121935q.getClass();
                a1Var2.f121936r.getClass();
                C44947a1 a1Var3 = this.f121791i;
                a1Var3.f121935q.getClass();
                a1Var3.f121936r.getClass();
                this.f121790h.setAdapter(this.f121791i);
                this.f121790h.setOnItemClickListener(new C45010u(this));
                Point point = new Point();
                this.f121790h.setOnTouchListener(new C6973w(this, point));
                this.f121790h.setOnItemLongClickListener(new C45016x(this, point));
            }
            this.f121796q = System.currentTimeMillis() / 1000;
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f121793n);
            if (j != null) {
                int G2 = j.mo108786G2();
                this.f121798s = G2;
                if (G2 == 0 && j.mo108788I2() > 0) {
                    this.f121798s = -1;
                }
                this.f121799t = j.mo108821o2() / 1000;
                this.f121800u = j.mo108832y2() == 1 ? null : j.mo108823q2();
            }
            C48009v0.Ex0().f128679e.add(this.f121804y, thisActivity().getMainLooper());
            C97625j3.m125812b().mo105908w().add(this);
            C97625j3.m125812b().mo105907v().add(this);
            if (this.f121791i != null) {
                MMHandler mMHandler = this.f121795p;
                if (mMHandler == null) {
                    this.f121795p = new C45018y(this);
                } else {
                    mMHandler.removeMessages(1);
                }
                this.f121795p.sendEmptyMessageDelayed(1, 500);
            }
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            if (i == 1 && i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("be_send_card_name");
                String stringExtra2 = intent.getStringExtra("received_card_name");
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                String stringExtra3 = intent.getStringExtra("custom_send_text");
                C7250m.m7431a().Y50(stringExtra, stringExtra2, booleanExtra);
                C7250m.m7431a().mo136252Ar(stringExtra3, stringExtra2);
                C75026b.m89951a(thisActivity(), getContext().getString(C0966R.string.euo));
            }
        }

        public void onDestroy() {
            C47971i Ex0 = C48009v0.Ex0();
            C47971i.C47973b bVar = this.f121804y;
            MStorageEvent<C47971i.C47973b, C47971i.C47973b.C47974a> mStorageEvent = Ex0.f128679e;
            if (mStorageEvent != null) {
                mStorageEvent.remove(bVar);
            }
            if (C97625j3.m125811a()) {
                C97625j3.m125812b().mo105908w().remove(this);
                C97625j3.m125812b().mo105907v().remove(this);
            }
            C44947a1 a1Var = this.f121791i;
            if (a1Var != null) {
                C45003s sVar = a1Var.f121935q;
                sVar.f122068C.stopTimer();
                HashMap<String, C45003s.C45005b> hashMap = sVar.f122072r;
                if (hashMap != null) {
                    hashMap.clear();
                    sVar.f122072r = null;
                }
                sVar.mo5580b();
                sVar.f24699h = null;
                C97625j3.m125812b().mo105908w().remove(sVar);
                C48395b bVar2 = a1Var.f121936r;
                HashMap<String, C48395b.C48397b> hashMap2 = bVar2.f129555z;
                if (hashMap2 != null) {
                    hashMap2.clear();
                    bVar2.f129555z = null;
                }
                C48009v0.Dx0().remove(bVar2);
                MStorageEvent<C48329b.C48332c, C48329b.C48332c.C48333a> mStorageEvent2 = C48009v0.Dx0().f129406e;
                if (mStorageEvent2 != null) {
                    mStorageEvent2.remove(bVar2);
                }
            }
            C47077m mVar = this.f121803x;
            if (mVar != null) {
                C97625j3.m125815e().mo123470p(1394, mVar);
            }
            long j = this.f121796q;
            if (j > 0) {
                long j2 = this.f121797r;
                if (j2 > 0) {
                    long j3 = j2 - j;
                    C47969h jo = C48009v0.Ex0().mo72749jo(this.f121793n);
                    int i = jo != null ? jo.field_qyUin : 0;
                    int i2 = jo != null ? jo.field_userUin : 0;
                    C115669n.INSTANCE.mo160131h(13465, "", Integer.valueOf(i), 0, Integer.valueOf(i2), 1, Long.valueOf(j3));
                    Log.m105919d("MicroMsg.EnterpriseConversationUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", Integer.valueOf(i), 0, Integer.valueOf(i2), 1, Long.valueOf(j3));
                }
            }
            super.onDestroy();
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        }

        public void onPause() {
            Log.m105926v("MicroMsg.EnterpriseConversationUI", "on pause");
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.f121793n);
            C44947a1 a1Var = this.f121791i;
            if (a1Var != null) {
                C45003s sVar = a1Var.f121935q;
                MMSlideDelView.C73186f fVar = sVar.f122073s;
                if (fVar != null) {
                    fVar.mo97957b();
                }
                sVar.f122077w = false;
                C48395b bVar = a1Var.f121936r;
                MMSlideDelView.C73186f fVar2 = bVar.f129546q;
                if (fVar2 != null) {
                    fVar2.mo97957b();
                }
                bVar.f129541A = false;
            }
            super.onPause();
        }

        public void onResume() {
            HashMap<String, C45003s.C45005b> hashMap;
            Log.m105926v("MicroMsg.EnterpriseConversationUI", "on resume");
            C47058a aVar = this.f121802w;
            if (aVar != null) {
                long j = aVar.f126472f;
                if (0 != j) {
                    C47058a.C47061c cVar = aVar.f126471e;
                    if (cVar != null) {
                        try {
                            ((C45013v) cVar).f122106a.f121791i.f121936r.mo73094t(j);
                        } catch (Throwable unused) {
                        }
                    }
                    aVar.f126472f = 0;
                }
            }
            C47077m mVar = this.f121803x;
            if (mVar != null) {
                mVar.getClass();
            }
            C44947a1 a1Var = this.f121791i;
            if (a1Var != null) {
                C45003s sVar = a1Var.f121935q;
                sVar.f122077w = true;
                Time time = new Time();
                time.setToNow();
                String charSequence = C72714e.m85106a("MM/dd", time).toString();
                boolean z = !sVar.f122079y.equals(charSequence);
                sVar.f122079y = charSequence;
                if (z && (hashMap = sVar.f122072r) != null) {
                    for (Map.Entry<String, C45003s.C45005b> value : hashMap.entrySet()) {
                        ((C45003s.C45005b) value.getValue()).f122083b = null;
                    }
                }
                if (sVar.f122078x) {
                    sVar.mo7991f();
                    sVar.f122078x = false;
                }
                C48395b bVar = a1Var.f121936r;
                bVar.f129541A = true;
                if (bVar.f129542B) {
                    bVar.mo7991f();
                    bVar.f129542B = false;
                }
            }
            super.onResume();
            if (!C45628s0.m50740E(this.f121793n)) {
                finish();
            }
        }
    }

    public void finish() {
        BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null && (baseConversationFmUI instanceof EnterpriseConversationFmUI)) {
            EnterpriseConversationFmUI enterpriseConversationFmUI = (EnterpriseConversationFmUI) baseConversationFmUI;
            enterpriseConversationFmUI.getClass();
            enterpriseConversationFmUI.f121797r = System.currentTimeMillis() / 1000;
        }
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6655kx, (ViewGroup) null);
        this.f121785e = inflate;
        setContentView(inflate);
        this.conversationFm = new EnterpriseConversationFmUI();
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.gvl, this.conversationFm, (String) null, 1);
        beginTransaction.mo165162d();
        C78538u.m94869e(this, this.f121785e);
    }
}
