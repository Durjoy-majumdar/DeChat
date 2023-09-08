package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C74753e;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.banner.EmojiStoreV3BannerView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C6653c1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import go3.C76004e;
import gy3.C8480h;
import gy3.C87412m;
import i61.C98605n;
import j20.C117292a;
import j61.C46439j;
import j61.C46443q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import o61.C100295b;
import ob0.C11385n;
import ob0.C117747y;
import p179jw.C9531b;
import p441aq.C92054g;
import p61.C100641b;
import te3.C101754a80;
import te3.C101824o80;
import te3.C51468tz1;
import te3.C51976xh3;
import te3.C52077y70;
import w51.C102330b;
import w51.C102340h;
import wh3.C38145t;
import wh3.C38146u;
import x51.C102553a;
import x51.C102554b;
import x51.C102555c;
import x51.C102556d;
import x51.C102562g;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment */
public abstract class EmojiStoreV2BaseFragment extends MMFragment implements C102340h.C102342b, AdapterView.OnItemClickListener, AbsListView.OnScrollListener, MMPullDownView.C73179f, MMPullDownView.C73178e, MMPullDownView.C73177d, C11385n, C93108e0.C93110b, C93108e0.C93111c, C9531b.C9532a, MStorage.IOnStorageChange {

    /* renamed from: A */
    public C46439j f268778A;

    /* renamed from: B */
    public byte[] f268779B;

    /* renamed from: C */
    public int f268780C;

    /* renamed from: D */
    public boolean f268781D;

    /* renamed from: E */
    public boolean f268782E = false;

    /* renamed from: F */
    public long f268783F;

    /* renamed from: G */
    public EmoticonStoreActionStruct f268784G = new EmoticonStoreActionStruct();

    /* renamed from: H */
    public boolean f268785H = false;

    /* renamed from: I */
    public boolean f268786I = false;

    /* renamed from: J */
    public boolean f268787J = false;

    /* renamed from: K */
    public C93108e0 f268788K;

    /* renamed from: L */
    public MMHandler f268789L = new C93220a();

    /* renamed from: M */
    public IListener f268790M = new IListener<EmotionStateChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 449099204;
        }

        public boolean callback(IEvent iEvent) {
            C102556d dVar;
            EmotionStateChangeEvent emotionStateChangeEvent = (EmotionStateChangeEvent) iEvent;
            if (emotionStateChangeEvent != null) {
                EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = EmojiStoreV2BaseFragment.this;
                EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
                String str = aVar.f264697a;
                int i = aVar.f264698b;
                int i2 = aVar.f264699c;
                String str2 = aVar.f264700d;
                emojiStoreV2BaseFragment.getClass();
                Log.m105919d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onExchange] productId:[%s] status:[%d] progress:[%d] cdnClientId:[%s]", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
                C102554b bVar = emojiStoreV2BaseFragment.f268806u;
                if (!(bVar == null || (dVar = bVar.f301966e) == null)) {
                    if (i == 6) {
                        Message obtain = Message.obtain();
                        obtain.getData().putString("product_id", str);
                        obtain.getData().putInt("progress", i2);
                        obtain.what = 131075;
                        MMHandler mMHandler = emojiStoreV2BaseFragment.f268789L;
                        if (mMHandler != null) {
                            mMHandler.sendMessage(obtain);
                        }
                    } else {
                        Log.m105925i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "product status:%d", Integer.valueOf(i));
                        Message obtain2 = Message.obtain();
                        obtain2.getData().putString("product_id", str);
                        obtain2.getData().putInt("status", i);
                        obtain2.what = StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON;
                        MMHandler mMHandler2 = emojiStoreV2BaseFragment.f268789L;
                        if (mMHandler2 != null) {
                            mMHandler2.sendMessage(obtain2);
                        }
                    }
                    dVar.mo142184l(str);
                }
            }
            return false;
        }
    };

    /* renamed from: N */
    public MenuItem.OnMenuItemClickListener f268791N = new C93221b();

    /* renamed from: d */
    public C74753e f268792d;

    /* renamed from: e */
    public ActionBar f268793e;

    /* renamed from: f */
    public ProgressDialog f268794f;

    /* renamed from: g */
    public View f268795g;

    /* renamed from: h */
    public EmojiStoreV3BannerView f268796h;

    /* renamed from: i */
    public C100295b f268797i;

    /* renamed from: j */
    public C100641b f268798j;

    /* renamed from: n */
    public Boolean f268799n = Boolean.TRUE;

    /* renamed from: o */
    public EmojiStoreV2HotBarView f268800o;

    /* renamed from: p */
    public MMPullDownView f268801p;

    /* renamed from: q */
    public ListView f268802q;

    /* renamed from: r */
    public View f268803r;

    /* renamed from: s */
    public View f268804s;

    /* renamed from: t */
    public TextView f268805t;

    /* renamed from: u */
    public C102554b f268806u;

    /* renamed from: v */
    public int f268807v = -1;

    /* renamed from: w */
    public C41053r f268808w;

    /* renamed from: x */
    public LinkedList<C52077y70> f268809x = new LinkedList<>();

    /* renamed from: y */
    public LinkedList<C101754a80> f268810y = new LinkedList<>();

    /* renamed from: z */
    public C46443q f268811z;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment$a */
    public class C93220a extends MMHandler {
        public C93220a() {
        }

        public void handleMessage(Message message) {
            String string;
            String string2;
            EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = EmojiStoreV2BaseFragment.this;
            emojiStoreV2BaseFragment.getClass();
            switch (message.what) {
                case 131074:
                    C102554b bVar = emojiStoreV2BaseFragment.f268806u;
                    if (bVar != null) {
                        bVar.notifyDataSetChanged();
                        return;
                    }
                    return;
                case 131075:
                    if (emojiStoreV2BaseFragment.f268806u != null && message.getData() != null && (string = message.getData().getString("product_id")) != null) {
                        emojiStoreV2BaseFragment.f268806u.mo142178q(string, message.getData().getInt("progress"));
                        return;
                    }
                    return;
                case StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON:
                    if (emojiStoreV2BaseFragment.f268806u != null && message.getData() != null && (string2 = message.getData().getString("product_id")) != null) {
                        emojiStoreV2BaseFragment.f268806u.mo141911r(string2, message.getData().getInt("status"));
                        return;
                    }
                    return;
                case StartupILogsReport.TYPEID_FIRST_UI_SHOWN_INCLUDE_TINKER_LOAD_MISC_JSON:
                    if (emojiStoreV2BaseFragment.f268796h != null) {
                        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "startPlayHeader");
                        emojiStoreV2BaseFragment.f268796h.mo127905c();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment$b */
    public class C93221b implements MenuItem.OnMenuItemClickListener {
        public C93221b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EmojiStoreV2BaseFragment.this.thisActivity().finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment$c */
    public class C93222c implements Runnable {
        public C93222c() {
        }

        public void run() {
            EmojiStoreV2BaseFragment.this.mo127824S();
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment$d */
    public class C93223d implements DialogInterface.OnCancelListener {
        public C93223d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            EmojiStoreV2BaseFragment.this.getClass();
        }
    }

    /* renamed from: C7 */
    public boolean mo64409C7() {
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onBottomLoadData] startLoadRemoteEmoji.");
        mo127826U(true, false);
        return true;
    }

    /* renamed from: K */
    public void mo127816K(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* renamed from: L */
    public void mo127817L(int i, int i2, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        this.f268781D = false;
        View view = this.f268803r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i3 == 0 || i3 == 4) {
            View view2 = this.f268804s;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionList", "(IILcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268801p.setVisibility(0);
            C46443q qVar = (C46443q) yVar;
            C41053r k1 = C46443q.m51751k1(qVar.mo71839l1());
            this.f268779B = qVar.f125110p;
            if (i4 == 0) {
                C51468tz1 l1 = qVar.mo71839l1();
                mo127827V(this.f268807v, k1, false);
                if (this.f268807v == -1) {
                    C86709a0.m107525e().postToWorker(new C41073e(this, l1));
                }
                this.f268807v = 0;
            } else if (i4 == 2) {
                C51468tz1 l15 = qVar.mo71839l1();
                mo127827V(this.f268807v, k1, false);
                C102555c.m135404b(this.f268806u.f301966e, this);
                if (this.f268807v == -1) {
                    C86709a0.m107525e().postToWorker(new C41073e(this, l15));
                }
                this.f268807v = 2;
            } else if (i4 == 3) {
                mo127827V(this.f268807v, k1, false);
                this.f268807v = 1;
            } else {
                View view3 = this.f268804s;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f268801p.setVisibility(8);
                this.f268805t.setText(C0966R.string.c8p);
            }
        } else if (!this.f268782E) {
            View view5 = this.f268804s;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268801p.setVisibility(8);
            this.f268805t.setText(C0966R.string.f360087a11);
        }
    }

    /* renamed from: M */
    public abstract int mo127818M();

    /* renamed from: N */
    public final void mo127819N(C102562g gVar, int i) {
        if (gVar == null) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "item is null.");
            return;
        }
        boolean z = false;
        if (gVar.f301982a == C102562g.C102563a.cellset) {
            C101754a80 a802 = gVar.f301984c;
            if (a802 == null) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "banner set is null. do nothing");
            } else {
                C98605n.m128199a(getContext(), a802, false);
            }
        } else {
            C101824o80 o802 = gVar.f301983b;
            if (o802 == null) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "summary is null. do nothing");
                return;
            }
            if (mo127821P() && C41051m.m44498a().f110536d) {
                z = true;
            }
            this.f268784G.mo126613s(String.valueOf(i + 1));
            this.f268784G.mo126618x(o802.f298994d);
            this.f268784G.mo126614t(z ? o802.f299013z : o802.f299011x);
            EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268784G;
            emoticonStoreActionStruct.f265470f = 3;
            emoticonStoreActionStruct.mo126615u(String.valueOf(EmojiLogic.m117482m(o802.f298993D)));
            this.f268784G.mo126617w(String.valueOf(EmojiLogic.m117484o(o802.f298993D)));
            this.f268784G.mo126616v(EmojiLogic.m117483n(o802.f298993D));
            this.f268784G.mo86054n();
            C98605n.m128202d(getContext(), o802, false, mo127821P() ? (i < 0 || i >= this.f268806u.mo141897f()) ? (i < this.f268806u.mo141897f() || i >= this.f268806u.mo141899i() + this.f268806u.mo141897f()) ? 1 : 19 : 3 : 2, gVar.f301987f, gVar.f301986e, thisActivity().getIntent().getStringExtra("to_talker_name"), 5, this.f268784G);
        }
    }

    /* renamed from: O */
    public void mo127820O() {
        int i;
        int i2;
        int i3;
        this.f268786I = true;
        this.f268783F = System.currentTimeMillis();
        C51976xh3 xh32 = new C51976xh3();
        long j = this.f268783F;
        xh32.f144663f = j;
        this.f268784G.f265468d = j;
        Log.m105925i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "initeData: %s", Long.valueOf(j));
        try {
            this.f268779B = xh32.toByteArray();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2BaseFragment", e, "", new Object[0]);
        }
        C93108e0 e0Var = new C93108e0();
        this.f268788K = e0Var;
        e0Var.f268238d = thisActivity();
        C93108e0 e0Var2 = this.f268788K;
        e0Var2.f268239e = this;
        e0Var2.f268235a = this.f268806u;
        if (mo127821P()) {
            this.f268788K.f268240f = 1;
        } else {
            this.f268788K.f268240f = 2;
        }
        this.f268788K.f268241g = this;
        this.f268780C = thisActivity().getIntent().getIntExtra("preceding_scence", 5);
        mo127818M();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C38146u g = C30790w2.m39221h().mo57720g();
        int M = mo127818M();
        Cursor query = g.f100795d.query("GetEmotionListCache", (String[]) null, "reqType=?", new String[]{String.valueOf(M)}, (String) null, (String) null, (String) null, 2);
        C51468tz1 tz12 = null;
        if (query != null && query.moveToFirst()) {
            C38145t tVar = new C38145t(query);
            try {
                C51468tz1 tz13 = new C51468tz1();
                tz13.parseFrom(tVar.field_cache);
                Log.m105919d("MicroMsg.emoji.Storage", "succed get cache: %d", Integer.valueOf(M));
                tz12 = tz13;
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.emoji.Storage", "exception:%s", Util.stackTraceToString(e2));
            }
        }
        if (query != null) {
            query.close();
        }
        C41053r k1 = C46443q.m51751k1(tz12);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(mo127818M());
        objArr[1] = Integer.valueOf(tz12 == null ? 0 : tz12.f142490e);
        Log.m105919d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache type: %d, size: %d ", objArr);
        if (k1 != null && k1.f110540b.size() > 0) {
            this.f268782E = true;
            View view = this.f268804s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "loadCache", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "loadCache", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268801p.setVisibility(0);
            mo127827V(this.f268807v, k1, true);
            if (tz12 != null) {
                LinkedList<C101754a80> linkedList = tz12.f142502t;
                i3 = linkedList == null ? 0 : linkedList.size();
                i2 = tz12.f142499q;
                i = tz12.f142500r;
            } else {
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            Log.m105925i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache hotcount:%d type:%d", Integer.valueOf(i2), Integer.valueOf(mo127818M()));
            if (this.f268806u != null && mo127821P()) {
                this.f268806u.mo141902o(i2 + i3);
                this.f268806u.mo141903p(i);
            }
            C102555c.m135404b(this.f268806u.f301966e, this);
        }
        mo127823R(this.f268779B);
        C86709a0.m107529k().f251779b.mo123460f(this.f268811z);
        MMHandlerThread.postToMainThreadDelayed(new C93222c(), 500);
    }

    /* renamed from: P */
    public abstract boolean mo127821P();

    /* renamed from: Q */
    public abstract C102554b mo127822Q();

    /* renamed from: R */
    public void mo127823R(byte[] bArr) {
        int M = mo127818M();
        int i = this.f268780C;
        if (bArr != null) {
            Log.m105925i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer %s", bArr.toString());
            this.f268811z = new C46443q(M, bArr, i, false);
            return;
        }
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer is null.");
        this.f268811z = new C46443q(M, i);
    }

    /* renamed from: S */
    public void mo127824S() {
    }

    /* renamed from: T */
    public void mo127825T(String str) {
        if (isFinishing()) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[showLoadingDialog] acitivity is finished.");
            return;
        }
        this.f268794f = C76879j.m92723Q(thisActivity(), getString(C0966R.string.a3h), str, true, true, new C93223d());
    }

    /* renamed from: U */
    public void mo127826U(boolean z, boolean z2) {
        if (this.f268781D) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "isLoading");
            return;
        }
        this.f268781D = true;
        if (z) {
            View view = this.f268803r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo127823R(this.f268779B);
        C86709a0.m107529k().f251779b.mo123460f(this.f268811z);
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
        if (!z && !z2) {
            mo127825T(getString(C0966R.string.a4d));
        }
    }

    /* renamed from: V */
    public void mo127827V(int i, C41053r rVar, boolean z) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "");
        boolean z2 = false;
        boolean z3 = true;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    this.f268808w = rVar;
                } else if (i == 2) {
                    if (this.f268808w == null) {
                        this.f268808w = new C41053r();
                    }
                    C41053r rVar2 = this.f268808w;
                    rVar2.f110539a += rVar.f110539a;
                    rVar2.mo64091b(rVar.f110540b, 2);
                }
                z2 = true;
            } else {
                this.f268808w = rVar;
            }
            z3 = false;
        } else {
            this.f268808w = rVar;
            z2 = true;
        }
        C41053r rVar3 = this.f268808w;
        if (rVar3 != null) {
            rVar3.mo64090a();
        }
        C41053r rVar4 = this.f268808w;
        if (rVar4 != null && z2) {
            if (z3) {
                LinkedList<C52077y70> linkedList = (LinkedList) rVar4.f110542d;
                this.f268809x = linkedList;
                LinkedList<C101754a80> linkedList2 = (LinkedList) rVar4.f110543e;
                this.f268810y = linkedList2;
                if (linkedList != null) {
                    C100295b bVar = this.f268797i;
                    bVar.mo139551G4(bVar.mo139550F4(linkedList, linkedList2));
                } else if (rVar4.f110541c != null) {
                    LinkedList<C52077y70> linkedList3 = new LinkedList<>();
                    this.f268809x = linkedList3;
                    linkedList3.add(this.f268808w.f110541c);
                    C100295b bVar2 = this.f268797i;
                    LinkedList<C52077y70> linkedList4 = this.f268809x;
                    LinkedList<C101754a80> linkedList5 = this.f268810y;
                    if (linkedList4 == null && linkedList5 == null) {
                        bVar2.getClass();
                    } else {
                        bVar2.mo139551G4(bVar2.mo139550F4(linkedList4, linkedList5));
                    }
                }
                int i2 = this.f268798j.f294934c;
                if (this.f268799n.booleanValue()) {
                    this.f268796h.mo127903a(i2);
                    this.f268799n = Boolean.FALSE;
                }
                if (this.f268797i.getItemCount() == 0) {
                    this.f268802q.removeHeaderView(this.f268795g);
                    if (getBounceView() != null) {
                        getBounceView().setStart2EndBgColor(getResources().getColor(C0966R.color.al6));
                    }
                }
            }
            C102554b bVar3 = this.f268806u;
            if (bVar3 != null) {
                MMHandlerThread.postToMainThread(new C102553a(bVar3, this.f268808w));
            }
        }
    }

    /* renamed from: b0 */
    public boolean mo64386b0() {
        return false;
    }

    /* renamed from: c0 */
    public void mo127624c0(String str, String str2, String str3, String str4, String str5) {
        this.f268778A = new C46439j(str, str2, str3, (String) null, str5);
        C86709a0.m107529k().f251779b.mo123460f(this.f268778A);
    }

    /* renamed from: g2 */
    public void mo5537g2(ArrayList<C6653c1> arrayList) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "google [onQueryFinish]");
        if (this.f268806u != null) {
            MMHandler mMHandler = this.f268789L;
            if (mMHandler != null) {
                mMHandler.sendEmptyMessageDelayed(131074, 50);
            }
            C102555c.m135403a(arrayList, this.f268806u.f301966e);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    /* renamed from: k5 */
    public void mo127623k5(C102330b bVar) {
        if (bVar.mo141888g() == 9) {
            mo127825T(getString(C0966R.string.a3p));
        }
        C93108e0 e0Var = this.f268788K;
        e0Var.f268245k = this.f268784G;
        e0Var.f268246l = mo127821P() && C41051m.m44498a().f110536d;
        if (mo127821P()) {
            int i = bVar.f301385e;
            if (i >= 0 && i < this.f268806u.mo141897f()) {
                this.f268788K.f268240f = 3;
            } else if (bVar.f301385e < this.f268806u.mo141897f() || bVar.f301385e >= this.f268806u.mo141899i() + this.f268806u.mo141897f()) {
                this.f268788K.f268240f = 1;
            } else {
                this.f268788K.f268240f = 19;
            }
        } else {
            this.f268788K.f268240f = 2;
        }
        this.f268788K.mo127620c(bVar);
    }

    public void onActivityCreated(Bundle bundle) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityCreated");
        super.onActivityCreated(bundle);
        this.f268787J = true;
        C102554b Q = mo127822Q();
        this.f268806u = Q;
        Q.f301967f = this;
        View findViewById = findViewById(C0966R.C0970id.cig);
        this.f268804s = findViewById;
        this.f268805t = (TextView) findViewById.findViewById(C0966R.C0970id.cip);
        View inflate = getActivityLayoutInflater().inflate(C0966R.C0971layout.a2i, (ViewGroup) null);
        this.f268803r = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int a = C79406f.m96347a(getContext(), 12.0f);
        EmojiStoreV3BannerView.C93268a aVar2 = new EmojiStoreV3BannerView.C93268a(false, false, false, 0, 0, 0, 0, 127, (C8480h) null);
        aVar2.f269063c = true;
        aVar2.f269066f = a;
        aVar2.f269061a = true;
        aVar2.f269067g = a;
        aVar2.f269064d = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
        int a2 = C79406f.m96347a(getContext(), 19.04f);
        int a3 = C79406f.m96347a(getContext(), 24.0f);
        int a4 = C79406f.m96347a(getContext(), 176.0f);
        View inflate2 = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ck_, (ViewGroup) null, false);
        this.f268795g = inflate2;
        inflate2.setBackgroundResource(C0966R.color.BW_93);
        this.f268796h = (EmojiStoreV3BannerView) this.f268795g.findViewById(C0966R.C0970id.lyh);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a4);
        layoutParams.setMargins(0, a2, 0, a3);
        this.f268796h.setLayoutParams(layoutParams);
        Context context = this.f268796h.getContext();
        C87412m.m108593f(context, "context");
        C100295b bVar = new C100295b(context, new LinkedList());
        this.f268797i = bVar;
        this.f268796h.mo127904b(aVar2, bVar);
        this.f268798j = new C100641b();
        ListView listView = (ListView) findViewById(16908298);
        this.f268802q = listView;
        listView.addHeaderView(this.f268795g);
        if (!mo127821P()) {
            EmojiStoreV2HotBarView emojiStoreV2HotBarView = new EmojiStoreV2HotBarView(getContext());
            this.f268800o = emojiStoreV2HotBarView;
            emojiStoreV2HotBarView.setDesignerEmojiViewVisibility(8);
            this.f268800o.setDesignerCatalogViewPadding(false);
            this.f268802q.addHeaderView(this.f268800o);
        }
        this.f268802q.addFooterView(this.f268803r);
        this.f268802q.setAdapter(this.f268806u);
        if (mo127821P()) {
            this.f268802q.setOnItemClickListener(this);
        } else {
            ((C102340h) this.f268806u).f301434u = this;
        }
        this.f268802q.setOnScrollListener(this);
        this.f268802q.setLongClickable(false);
        this.f268802q.setOnTouchListener(new C41072d(this));
        this.f268806u.getClass();
        MMPullDownView mMPullDownView = (MMPullDownView) findViewById(C0966R.C0970id.g2v);
        this.f268801p = mMPullDownView;
        if (mMPullDownView != null) {
            mMPullDownView.setTopViewVisible(false);
            this.f268801p.setAtTopCallBack(this);
            this.f268801p.setOnBottomLoadDataListener(this);
            this.f268801p.setAtBottomCallBack(this);
            this.f268801p.setBottomViewVisible(false);
            this.f268801p.setIsBottomShowAll(false);
            this.f268801p.setIsReturnSuperDispatchWhenCancel(true);
        }
        if (this.f268785H) {
            mo127820O();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        super.onActivityResult(i, i2, intent);
        C93108e0 e0Var = this.f268788K;
        if (e0Var != null) {
            e0Var.mo127619b(i, i2, intent);
        } else {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "mPayOrDownloadComponent have no init.");
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onAttach");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        EmojiStoreV3BannerView emojiStoreV3BannerView = this.f268796h;
        if (emojiStoreV3BannerView != null) {
            emojiStoreV3BannerView.requestLayout();
        }
        setRequestedOrientation(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        if (!EmojiLogic.m117470a()) {
            this.f268793e = C76004e.m91288N(((AppCompatActivity) thisActivity()).getSupportActionBar());
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6301b3, (ViewGroup) null);
            this.f268792d = new C74753e(inflate);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f268793e.mo91091I(new ColorDrawable(getResources().getColor(17170445)));
            this.f268793e.mo91088F(false);
            this.f268793e.mo91084B(false);
            this.f268793e.mo91087E(false);
            this.f268793e.mo91086D(true);
            this.f268793e.mo91114y(inflate);
            this.f268793e.mo91094L();
            C74753e eVar = this.f268792d;
            eVar.f219802d.setText(C0966R.string.f360372c82);
            if (C44706b.m49450a()) {
                C44706b.m49451b(eVar.f219802d, C0966R.dimen.f3619c);
            } else if (C76577a.m92147C(eVar.f219802d.getContext())) {
                TextView textView = eVar.f219802d;
                textView.setTextSize(0, ((float) C76577a.m92155f(textView.getContext(), C0966R.dimen.f3619c)) * C76577a.m92161l(eVar.f219802d.getContext()));
            }
            C74753e eVar2 = this.f268792d;
            eVar2.f219799a.setOnClickListener(new C93245b(this));
            showOptionMenu(true);
            addIconOptionMenu(0, C0966R.raw.actionbar_setting_icon, new C41071c(this));
        }
        this.f268790M.alive();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().add(this);
        if (getBounceView() != null) {
            getBounceView().setStart2EndBgColor(getResources().getColor(C0966R.color.BW_93));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onCreateView");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        setHasOptionsMenu(false);
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDestroy");
        C102554b bVar = this.f268806u;
        if (bVar != null) {
            bVar.mo141905a();
            this.f268806u = null;
        }
        C100295b bVar2 = this.f268797i;
        if (bVar2 != null) {
            Log.m105924i(bVar2.f293807f, "clear");
            bVar2.f293806e.clear();
            bVar2.f293808g.clear();
        }
        this.f268790M.dead();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
    }

    public void onDetach() {
        super.onDetach();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDetach");
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int headerViewsCount = i - this.f268802q.getHeaderViewsCount();
        if (headerViewsCount < 0 || headerViewsCount >= this.f268806u.getCount()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C102562g g = this.f268806u.getItem(headerViewsCount);
        mo127819N(g, headerViewsCount);
        if (mo127821P() && this.f268806u.mo141899i() > 0 && headerViewsCount >= this.f268806u.mo141897f() && headerViewsCount < this.f268806u.mo141897f() + this.f268806u.mo141899i() && g.f301983b != null) {
            C115669n nVar = C115669n.INSTANCE;
            C101824o80 o802 = g.f301983b;
            nVar.mo160131h(13223, 1, o802.f298994d, o802.f298996f, 1, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        MMHandler mMHandler;
        if (!TextUtils.isEmpty(str) && str.equals("delete_group") && (mMHandler = this.f268789L) != null) {
            mMHandler.sendEmptyMessageDelayed(131074, 50);
        }
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107529k().f251779b.mo123470p(411, this);
        C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodSetNgStrength, this);
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onPause");
    }

    public void onResume() {
        C102556d dVar;
        super.onResume();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
        C86709a0.m107529k().f251779b.mo123455a(411, this);
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodSetNgStrength, this);
        if (this.f268785H) {
            C102554b bVar = this.f268806u;
            if (!(bVar == null || (dVar = bVar.f301966e) == null)) {
                dVar.mo142180f();
                this.f268806u.mo142175k();
            }
            C85801v1 i = C86709a0.m107535s().mo121142i();
            Boolean bool = Boolean.FALSE;
            if (((Boolean) i.mo119684e(208900, bool)).booleanValue()) {
                mo127625z4(false);
                C86709a0.m107535s().mo121142i().mo119676J(208900, bool);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        int i4;
        int i5;
        Log.m105925i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd errType:%d,errCode:%d,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f268794f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f268794f.dismiss();
        }
        int type = yVar.getType();
        if (type != 411) {
            Log.m105928w("MicroMsg.emoji.EmojiStoreV2BaseFragment", "unknow scene type.");
        } else if (yVar instanceof C46443q) {
            C46443q qVar = (C46443q) yVar;
            if (qVar.f125103f == mo127818M()) {
                if (qVar.mo71839l1() != null) {
                    if (this.f268806u.mo141896b() > 0 || !mo127821P()) {
                        i5 = 0;
                    } else {
                        i5 = qVar.mo71839l1().f142502t == null ? 0 : qVar.mo71839l1().f142502t.size();
                        this.f268806u.mo141901n(i5);
                    }
                    i4 = qVar.mo71839l1().f142499q;
                    i3 = qVar.mo71839l1().f142500r;
                } else {
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                }
                Log.m105925i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd setSize:%d hotcount:%d recentHotCount:%d type:%d getSceneType:%d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(type), Integer.valueOf(qVar.f125103f));
                C102554b bVar = this.f268806u;
                if (bVar != null && bVar.mo141899i() <= 0 && mo127821P()) {
                    C102554b bVar2 = this.f268806u;
                    bVar2.mo141902o(i4 + bVar2.mo141896b());
                    this.f268806u.mo141903p(i3);
                }
                mo127817L(i, i2, yVar);
                if (mo127821P()) {
                    if (!(qVar.mo71839l1() == null || qVar.mo71839l1().f142502t == null || qVar.mo71839l1().f142502t.size() <= 0)) {
                        for (int i6 = 0; i6 < qVar.mo71839l1().f142502t.size(); i6++) {
                            C115669n.INSTANCE.mo160131h(13223, 0, Integer.valueOf(qVar.mo71839l1().f142502t.get(i6).f297841g), qVar.mo71839l1().f142502t.get(i6).f297839e, 0);
                        }
                    }
                    if (qVar.mo71839l1().f142500r > 0 && qVar.mo71839l1().f142491f != null && qVar.mo71839l1().f142491f.size() > qVar.mo71839l1().f142499q + qVar.mo71839l1().f142500r) {
                        for (int i7 = 0; i7 < qVar.mo71839l1().f142500r; i7++) {
                            C115669n.INSTANCE.mo160131h(13223, 0, qVar.mo71839l1().f142491f.get(qVar.mo71839l1().f142499q + i7).f298994d, qVar.mo71839l1().f142491f.get(qVar.mo71839l1().f142499q + i7).f298996f, 1);
                        }
                    }
                }
            }
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f268807v == 0 || this.f268781D) {
                Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "No More List.");
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            mo127826U(true, false);
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onScrollStateChanged] startLoadRemoteEmoji.");
        }
        if (i == 0) {
            mo127824S();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2BaseFragment", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void onStart() {
        super.onStart();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStop");
    }

    /* renamed from: q0 */
    public boolean mo64384q0() {
        return false;
    }

    public void setUserVisibleHint(boolean z) {
        Log.m105919d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "setUserVisibleHint :%b", Boolean.valueOf(z));
        super.setUserVisibleHint(z);
        this.f268785H = z;
        if (!this.f268786I && this.f268787J) {
            mo127820O();
        } else if (z) {
            mo127824S();
        }
        if (this.f268785H) {
            MMHandler mMHandler = this.f268789L;
            if (mMHandler != null) {
                mMHandler.sendEmptyMessageDelayed(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_INCLUDE_TINKER_LOAD_MISC_JSON, 0);
                return;
            }
            return;
        }
        MMHandler mMHandler2 = this.f268789L;
        if (mMHandler2 != null) {
            mMHandler2.removeMessages(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_INCLUDE_TINKER_LOAD_MISC_JSON);
        }
        if (this.f268796h != null) {
            Log.m105918d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "stopPlayHeader");
            EmojiStoreV3BannerView.C93269b bVar = this.f268796h.f269055h;
            if (bVar != null) {
                bVar.removeCallbacksAndMessages((Object) null);
            }
        }
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }

    /* renamed from: z4 */
    public void mo127625z4(boolean z) {
        this.f268779B = null;
        this.f268807v = -1;
        mo127826U(z, false);
    }
}
