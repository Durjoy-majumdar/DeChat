package com.tencent.p014mm.p136ui.bizchat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C44697a0;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.presenter.BaseBizConversationUI;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import kg3.C76577a;
import ml3.C47067f;
import nj3.C11184p0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p248ug.C52558c;
import p910lj.C76701a;
import qo3.C89779i0;
import rb0.C47964c0;
import rb0.C47971i;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48329b;
import sb0.C48334c;
import sb0.C48335d;
import sb0.C48353j;
import sb0.C48359n;
import sj3.C48395b;
import te3.C51801w9;
import uo3.C78253a;
import wc3.C78538u;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI */
public class BizChatConversationUI extends BaseBizConversationUI {

    /* renamed from: e */
    public View f121334e;

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI$BizChatConversationFmUI */
    public static class BizChatConversationFmUI extends BaseConversationUI.BaseConversationFmUI implements MStorageEx.IOnStorageChange, C47964c0 {

        /* renamed from: y */
        public static final /* synthetic */ int f121335y = 0;

        /* renamed from: d */
        public TextView f121336d;

        /* renamed from: e */
        public LinearLayout f121337e;

        /* renamed from: f */
        public ListView f121338f;

        /* renamed from: g */
        public C89779i0 f121339g;

        /* renamed from: h */
        public C48395b f121340h;

        /* renamed from: i */
        public C11184p0 f121341i;

        /* renamed from: j */
        public String f121342j;

        /* renamed from: n */
        public String f121343n;

        /* renamed from: o */
        public C48353j f121344o;

        /* renamed from: p */
        public boolean f121345p;

        /* renamed from: q */
        public boolean f121346q = false;

        /* renamed from: r */
        public int f121347r = 0;

        /* renamed from: s */
        public int f121348s = 0;

        /* renamed from: t */
        public int f121349t = 0;

        /* renamed from: u */
        public long f121350u;

        /* renamed from: v */
        public C48329b.C48332c f121351v = new C44730a();

        /* renamed from: w */
        public C48335d.C48337b f121352w = new C44731b();

        /* renamed from: x */
        public C47971i.C47973b f121353x = new C44732c();

        /* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI$BizChatConversationFmUI$a */
        public class C44730a implements C48329b.C48332c {
            public C44730a() {
            }

            /* renamed from: a */
            public void mo69969a(C48329b.C48332c.C48333a aVar) {
                C48327a aVar2;
                if (aVar != null && (aVar2 = aVar.f129411b) != null && BizChatConversationFmUI.this.f121342j.equals(aVar2.field_brandUserName)) {
                    Log.m105924i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChatConv change");
                    BizChatConversationFmUI.this.f121340h.mo73094t(aVar.f129410a);
                    BizChatConversationFmUI bizChatConversationFmUI = BizChatConversationFmUI.this;
                    if (bizChatConversationFmUI.f121345p) {
                        bizChatConversationFmUI.f121340h.mo1333o();
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI$BizChatConversationFmUI$b */
        public class C44731b implements C48335d.C48337b {
            public C44731b() {
            }

            /* renamed from: a */
            public void mo69970a(C48335d.C48337b.C48339b bVar) {
                C48334c cVar;
                if (bVar != null && (cVar = bVar.f129425c) != null && BizChatConversationFmUI.this.f121342j.equals(cVar.field_brandUserName)) {
                    Log.m105924i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChat change");
                    BizChatConversationFmUI.this.f121340h.mo73094t(bVar.f129424b);
                    BizChatConversationFmUI bizChatConversationFmUI = BizChatConversationFmUI.this;
                    if (bizChatConversationFmUI.f121345p) {
                        bizChatConversationFmUI.f121340h.mo1333o();
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI$BizChatConversationFmUI$c */
        public class C44732c implements C47971i.C47973b {
            public C44732c() {
            }

            /* renamed from: a */
            public void mo69971a(C47971i.C47973b.C47974a aVar) {
                BizChatConversationFmUI bizChatConversationFmUI = BizChatConversationFmUI.this;
                int i = BizChatConversationFmUI.f121335y;
                String K = bizChatConversationFmUI.mo69965K();
                if (aVar != null && !Util.isNullOrNil(aVar.f128680a) && aVar.f128680a.equals(K)) {
                    BizChatConversationFmUI bizChatConversationFmUI2 = BizChatConversationFmUI.this;
                    int i2 = bizChatConversationFmUI2.f121347r;
                    bizChatConversationFmUI2.f121347r = C44697a0.m49439a(bizChatConversationFmUI2.getContext(), K);
                    BizChatConversationFmUI bizChatConversationFmUI3 = BizChatConversationFmUI.this;
                    if (bizChatConversationFmUI3.f121347r != i2) {
                        bizChatConversationFmUI3.mo69967M();
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.bizchat.BizChatConversationUI$BizChatConversationFmUI$d */
        public class C44733d implements View.OnClickListener {
            public C44733d() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Activity context = BizChatConversationFmUI.this.getContext();
                BizChatConversationFmUI bizChatConversationFmUI = BizChatConversationFmUI.this;
                int i = BizChatConversationFmUI.f121335y;
                C44697a0.m49440b(context, bizChatConversationFmUI.mo69965K(), 4);
                C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: K */
        public final String mo69965K() {
            if (Util.isNullOrNil(this.f121343n)) {
                this.f121343n = C48009v0.Fx0().mo72757SE(this.f121342j).mo73498p2();
            }
            return this.f121343n;
        }

        /* renamed from: L */
        public final void mo69966L(long j) {
            Bundle bundle = new Bundle();
            bundle.putLong("key_biz_chat_id", j);
            bundle.putBoolean("finish_direct", false);
            bundle.putBoolean("key_need_send_video", false);
            bundle.putBoolean("key_is_biz_chat", true);
            this.f219287ui.startChatting(this.f121342j, bundle, true);
        }

        /* renamed from: M */
        public final void mo69967M() {
            String K = mo69965K();
            int a = C44697a0.m49439a(getContext(), K);
            this.f121347r = a;
            if (a == 2 && this.f121337e == null) {
                LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ag_);
                this.f121337e = linearLayout;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = C76577a.m92157h(getContext(), C0966R.dimen.f3683bc);
                this.f121337e.setLayoutParams(layoutParams);
                View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a3t, this.f121337e, false);
                float p = C76577a.m92165p(getContext());
                CdnImageView cdnImageView = (CdnImageView) inflate.findViewById(C0966R.C0970id.f2a);
                int i = (int) (p * ((float) cdnImageView.getLayoutParams().height));
                cdnImageView.getLayoutParams().height = i;
                cdnImageView.getLayoutParams().width = i;
                cdnImageView.requestLayout();
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
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
                this.f121337e.addView(inflate);
                inflate.setOnClickListener(new C44733d());
                Activity context = getContext();
                String str2 = this.f121342j;
                if (C72688j0.m85020f(context, "com.tencent.wework")) {
                    C44697a0.m49444f(str2, 4, 4);
                } else {
                    C44697a0.m49444f(str2, 5, 4);
                }
                C44697a0.m49442d(getContext(), K);
            }
            LinearLayout linearLayout2 = this.f121337e;
            if (linearLayout2 == null) {
                return;
            }
            if (this.f121347r == 2) {
                linearLayout2.setVisibility(0);
            } else {
                linearLayout2.setVisibility(8);
            }
        }

        /* renamed from: c7 */
        public void mo7311c7(int i, C117747y yVar) {
            C89779i0 i0Var = this.f121339g;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f121339g = null;
            }
            if (yVar.getType() == 1355) {
                C48334c Lo = C48009v0.Ax0().mo73039Lo(((C48359n) yVar).mo73080j1().f144378e.f143623d.f144611d);
                if (Lo == null) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) getString(C0966R.string.f361211i61), 0).show();
                } else {
                    mo69966L(Lo.field_bizChatLocalId);
                }
            }
        }

        public int getLayoutId() {
            return C0966R.C0971layout.a3s;
        }

        public String getUserName() {
            return Util.isNullOrNil(this.f121343n) ? this.f121342j : this.f121343n;
        }

        public void onActivityCreated(Bundle bundle) {
            C48353j jVar;
            super.onActivityCreated(bundle);
            this.f121342j = thisActivity().getIntent().getStringExtra("Contact_User");
            Log.m105924i("MicroMsg.BizChatConversationFmUI", "[registerListener]");
            C48009v0.Dx0().f129406e.add(this.f121351v, thisActivity().getMainLooper());
            C48009v0.Ax0().f129418e.add(this.f121352w, thisActivity().getMainLooper());
            C48009v0.Ex0().f128679e.add(this.f121353x, thisActivity().getMainLooper());
            C97625j3.m125812b().mo105908w().add(this);
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
            this.f121336d = textView;
            textView.setText(C0966R.string.gma);
            this.f121338f = (ListView) findViewById(C0966R.C0970id.kpr);
            try {
                mo69967M();
            } catch (NullPointerException unused) {
            }
            C48395b bVar = new C48395b(thisActivity(), new C44763m(this), this.f121342j);
            this.f121340h = bVar;
            this.f121338f.setAdapter(bVar);
            this.f121341i = new C44758i(this);
            C78253a aVar = new C78253a(thisActivity());
            this.f121338f.setOnTouchListener(new C44760j(this));
            this.f121338f.setOnItemLongClickListener(new C44761k(this, aVar));
            this.f121338f.setOnItemClickListener(new C44762l(this));
            setBackBtn(new C44750a(this));
            addIconOptionMenu(1, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C44751b(this));
            addIconOptionMenu(2, (int) C0966R.string.f7374ee, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C47067f(this.f219287ui, mo69965K()));
            String Pk = C48009v0.Bx0().mo73076Pk(this.f121342j);
            C48353j jVar2 = C48009v0.Bx0().get(Pk);
            this.f121344o = jVar2;
            Object[] objArr = new Object[3];
            objArr[0] = this.f121342j;
            objArr[1] = Pk;
            objArr[2] = Boolean.valueOf(jVar2 == null);
            Log.m105925i("MicroMsg.BizChatConversationFmUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
            if (Util.isNullOrNil(Pk) || (jVar = this.f121344o) == null || jVar.mo73074m2() || Util.isNullOrNil(this.f121344o.field_addMemberUrl)) {
                C48009v0.yx0().mo73062h(this.f121342j, this);
                this.f121339g = C76879j.m92723Q(thisActivity(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C44755f(this));
            }
            C86709a0.m107525e().postToWorkerDelayed(new C44756g(this), 300);
            String K = mo69965K();
            if (K != null) {
                C48009v0.Ex0().mo72745SE(K, (C11385n) null);
                Log.m105921e("MicroMsg.BizChatConversationFmUI", "update father attr from svr mainBizName:%s", K);
            } else {
                Log.m105920e("MicroMsg.BizChatConversationFmUI", "mainBizName is null!!!");
            }
            C48009v0.Ex0().mo72749jo(mo69965K());
            Looper.myQueue().addIdleHandler(new C44757h(this));
            Intent intent = thisActivity().getIntent();
            if (IntentUtil.getBooleanExtra(intent, "biz_chat_need_to_jump_to_chatting_ui", false)) {
                long longExtra = intent.getLongExtra("biz_chat_chat_id", -1);
                if (longExtra != -1) {
                    mo69966L(longExtra);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityResult(int r7, int r8, android.content.Intent r9) {
            /*
                r6 = this;
                super.onActivityResult(r7, r8, r9)
                r0 = -1
                if (r8 == r0) goto L_0x0007
                return
            L_0x0007:
                r8 = 1
                if (r7 == r8) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r7 = "result_data"
                android.os.Bundle r7 = r9.getBundleExtra(r7)
                r9 = 0
                if (r7 == 0) goto L_0x0076
                java.lang.String r0 = "MicroMsg.BizChatConversationFmUI"
                java.lang.String r1 = "bundle != null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                java.lang.String r0 = "enterprise_members"
                java.lang.String r7 = r7.getString(r0)
                te3.vq1 r0 = new te3.vq1
                r0.<init>()
                sb0.c r1 = new sb0.c
                r1.<init>()
                sb0.j r2 = r6.f121344o
                r3 = 0
                if (r2 == 0) goto L_0x0033
                java.lang.String r2 = r2.field_addMemberUrl
                goto L_0x0034
            L_0x0033:
                r2 = r3
            L_0x0034:
                r1.field_addMemberUrl = r2
                java.lang.String r2 = r6.f121342j
                r1.field_brandUserName = r2
                boolean r7 = sb0.C48340e.m53660a(r1, r7, r3, r0)
                if (r7 == 0) goto L_0x0076
                long r1 = r1.field_bizChatLocalId
                r3 = -1
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x004c
                r6.mo69966L(r1)
                goto L_0x0077
            L_0x004c:
                sb0.h r7 = rb0.C48009v0.yx0()
                java.lang.String r1 = r6.f121342j
                sb0.n r7 = r7.mo73058e(r1, r0, r6)
                androidx.fragment.app.FragmentActivity r0 = r6.thisActivity()
                r1 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r1 = r6.getString(r1)
                r2 = 2131821739(0x7f1104ab, float:1.927623E38)
                java.lang.String r2 = r6.getString(r2)
                r3 = 1
                r4 = 1
                com.tencent.mm.ui.bizchat.c r5 = new com.tencent.mm.ui.bizchat.c
                r5.<init>(r6, r7)
                qo3.i0 r7 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
                r6.f121339g = r7
                goto L_0x0077
            L_0x0076:
                r8 = 0
            L_0x0077:
                if (r8 != 0) goto L_0x008b
                androidx.fragment.app.FragmentActivity r7 = r6.thisActivity()
                r8 = 2131834929(0x7f113831, float:1.9302982E38)
                java.lang.String r8 = r6.getString(r8)
                android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r9)
                r7.show()
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.onActivityResult(int, int, android.content.Intent):void");
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            C48327a aVar = (C48327a) this.f121340h.getItem(adapterContextMenuInfo.position);
            this.f121350u = aVar.field_bizChatId;
            if (aVar.field_unReadCount <= 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 1, C0966R.string.f361010gm2);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 1, C0966R.string.f361008gm0);
            }
            if (C48009v0.Dx0().mo73026bF(aVar)) {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, C0966R.string.f361011gm3);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, C0966R.string.f361009gm1);
            }
            contextMenu.add(adapterContextMenuInfo.position, 0, 3, C0966R.string.gm7);
        }

        public void onDestroy() {
            Log.m105924i("MicroMsg.BizChatConversationFmUI", "[unRegitListener]");
            C48329b Dx0 = C48009v0.Dx0();
            C48329b.C48332c cVar = this.f121351v;
            MStorageEvent<C48329b.C48332c, C48329b.C48332c.C48333a> mStorageEvent = Dx0.f129406e;
            if (mStorageEvent != null) {
                mStorageEvent.remove(cVar);
            }
            C48335d Ax0 = C48009v0.Ax0();
            C48335d.C48337b bVar = this.f121352w;
            MStorageEvent<C48335d.C48337b, C48335d.C48337b.C48339b> mStorageEvent2 = Ax0.f129418e;
            if (mStorageEvent2 != null) {
                mStorageEvent2.remove(bVar);
            }
            C47971i Ex0 = C48009v0.Ex0();
            C47971i.C47973b bVar2 = this.f121353x;
            MStorageEvent<C47971i.C47973b, C47971i.C47973b.C47974a> mStorageEvent3 = Ex0.f128679e;
            if (mStorageEvent3 != null) {
                mStorageEvent3.remove(bVar2);
            }
            if (C97625j3.m125811a()) {
                C97625j3.m125812b().mo105908w().remove(this);
            }
            this.f121340h.mo5580b();
            C48395b bVar3 = this.f121340h;
            HashMap<String, C48395b.C48397b> hashMap = bVar3.f129555z;
            if (hashMap != null) {
                hashMap.clear();
                bVar3.f129555z = null;
            }
            C48009v0.Dx0().remove(bVar3);
            MStorageEvent<C48329b.C48332c, C48329b.C48332c.C48333a> mStorageEvent4 = C48009v0.Dx0().f129406e;
            if (mStorageEvent4 != null) {
                mStorageEvent4.remove(bVar3);
            }
            super.onDestroy();
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        }

        public void onPause() {
            Log.m105924i("MicroMsg.BizChatConversationFmUI", "on pause");
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.f121342j);
            C48329b Dx0 = C48009v0.Dx0();
            String str = this.f121342j;
            Dx0.getClass();
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.BizConversationStorage", "brandUserName is null");
            } else {
                String str2 = "update BizChatConversation set newUnReadCount = 0 where newUnReadCount != 0 and brandUserName = '" + str + "'";
                Log.m105919d("MicroMsg.BizConversationStorage", "resetNewUnreadCount :%s,sql:%s", Boolean.valueOf(Dx0.f129405d.execSQL("BizChatConversation", str2)), str2);
            }
            C48395b bVar = this.f121340h;
            if (bVar != null) {
                MMSlideDelView.C73186f fVar = bVar.f129546q;
                if (fVar != null) {
                    fVar.mo97957b();
                }
                bVar.f129541A = false;
            }
            this.f121345p = false;
            ((MMNotification) C97625j3.m125816f()).f194715b = "";
            super.onPause();
        }

        public void onResume() {
            String str;
            super.onResume();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f121342j);
            if (z1Var == null || !z1Var.mo62927s3()) {
                Log.m105928w("MicroMsg.BizChatConversationFmUI", "onResume is not contact now");
                finish();
                return;
            }
            C52558c b = C47984k.m53328b(this.f121342j);
            if (b == null || (str = b.field_enterpriseFather) == null || !C45628s0.m50740E(str)) {
                Log.m105928w("MicroMsg.BizChatConversationFmUI", "onResume enterpriseFather is invalid");
                finish();
                return;
            }
            if (C45628s0.m50746K(z1Var)) {
                setTitleMuteIconVisibility(0);
            } else {
                setTitleMuteIconVisibility(8);
            }
            this.f121345p = true;
            C48395b bVar = this.f121340h;
            if (bVar.f129541A) {
                bVar.mo7991f();
            } else {
                bVar.f129542B = true;
            }
            ((MMNotification) C97625j3.m125816f()).f194715b = this.f121342j;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C78538u.m94869e(this, this.f121334e);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6655kx, (ViewGroup) null);
        this.f121334e = inflate;
        setContentView(inflate);
        this.conversationFm = new BizChatConversationFmUI();
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.gvl, this.conversationFm, (String) null, 1);
        beginTransaction.mo165162d();
        C78538u.m94869e(this, this.f121334e);
    }
}
