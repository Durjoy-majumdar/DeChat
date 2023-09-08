package com.tencent.p014mm.plugin.emoji.p040ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiBaseActivity;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3TopicUI;
import com.tencent.p014mm.pluginsdk.model.C6653c1;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.StoreBannerEmojiView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import i61.C98605n;
import j20.C117292a;
import j61.C46439j;
import j61.C46443q;
import j61.C46445t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p179jw.C9531b;
import p441aq.C92054g;
import q61.C101038b;
import te3.C101754a80;
import te3.C101824o80;
import te3.C51018qv3;
import te3.C51468tz1;
import te3.C52077y70;
import w51.C102330b;
import w51.C102344i;
import x51.C102553a;
import x51.C102554b;
import x51.C102555c;
import x51.C102556d;
import x51.C102562g;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI */
public abstract class BaseEmojiStoreUI extends EmojiBaseActivity implements AdapterView.OnItemClickListener, C11385n, MStorage.IOnStorageChange, MMPullDownView.C73179f, AbsListView.OnScrollListener, MMPullDownView.C73178e, MMPullDownView.C73177d, C93108e0.C93110b, C9531b.C9532a, C93108e0.C93111c {

    /* renamed from: H */
    public static Map<String, Long> f268276H;

    /* renamed from: A */
    public IListener f268277A;

    /* renamed from: B */
    public boolean f268278B = true;

    /* renamed from: C */
    public boolean f268279C = true;

    /* renamed from: D */
    public C46439j f268280D;

    /* renamed from: E */
    public boolean f268281E = false;

    /* renamed from: F */
    public LinkedList<C52077y70> f268282F = new LinkedList<>();

    /* renamed from: G */
    public LinkedList<C101754a80> f268283G = new LinkedList<>();

    /* renamed from: f */
    public EmojiStoreVpHeader f268284f;

    /* renamed from: g */
    public View f268285g;

    /* renamed from: h */
    public StoreBannerEmojiView f268286h;

    /* renamed from: i */
    public ListView f268287i;

    /* renamed from: j */
    public C102554b f268288j;

    /* renamed from: n */
    public MMPullDownView f268289n;

    /* renamed from: o */
    public View f268290o;

    /* renamed from: p */
    public TextView f268291p;

    /* renamed from: q */
    public boolean f268292q = false;

    /* renamed from: r */
    public int f268293r = -1;

    /* renamed from: s */
    public boolean f268294s;

    /* renamed from: t */
    public View f268295t;

    /* renamed from: u */
    public byte[] f268296u;

    /* renamed from: v */
    public ProgressDialog f268297v;

    /* renamed from: w */
    public C46443q f268298w;

    /* renamed from: x */
    public int f268299x;

    /* renamed from: y */
    public C41053r f268300y;

    /* renamed from: z */
    public C93108e0 f268301z;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI$EmotionStatusChangeL */
    public class EmotionStatusChangeL extends IListener<EmotionStateChangeEvent> {
        public EmotionStatusChangeL() {
            super(C40008f.f107254d);
            this.__eventId = 449099204;
        }

        public boolean callback(IEvent iEvent) {
            C102556d dVar;
            BaseEmojiStoreUI baseEmojiStoreUI = BaseEmojiStoreUI.this;
            EmotionStateChangeEvent.C92476a aVar = ((EmotionStateChangeEvent) iEvent).f264696d;
            String str = aVar.f264697a;
            int i = aVar.f264698b;
            int i2 = aVar.f264699c;
            String str2 = aVar.f264700d;
            baseEmojiStoreUI.getClass();
            Log.m105919d("MicroMsg.emoji.BaseEmojiStoreUI", "[onExchange] productId:[%s] status:[%d] progress:[%d] cdnClientId:[%s]", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
            C102554b bVar = baseEmojiStoreUI.f268288j;
            if (!(bVar == null || (dVar = bVar.f301966e) == null)) {
                if (i == 6) {
                    baseEmojiStoreUI.mo127664g8(str, i2);
                } else {
                    Log.m105925i("MicroMsg.emoji.BaseEmojiStoreUI", "product status:%d", Integer.valueOf(i));
                    baseEmojiStoreUI.mo127665i8(str, i);
                }
                dVar.mo142184l(str);
            }
            return false;
        }
    }

    /* renamed from: C7 */
    public boolean mo64409C7() {
        mo127662e8(true, false);
        Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[onBottomLoadData] startLoadRemoteEmoji.");
        return true;
    }

    /* renamed from: H7 */
    public void mo127639H7(Message message) {
        C51468tz1 tz12;
        int i = message.what;
        if (i == 2002) {
            String str = (String) message.obj;
            if (isFinishing()) {
                Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[updateLoadingDialog] acitivity is finished.");
                return;
            }
            ProgressDialog progressDialog = this.f268297v;
            if (progressDialog != null) {
                progressDialog.setMessage(str);
            }
        } else if (i == 20001) {
            mo127643L7();
        } else if (i == 65537 && (tz12 = (C51468tz1) message.obj) != null) {
            Object[] objArr = new Object[3];
            int i2 = 0;
            objArr[0] = Integer.valueOf(tz12.f142490e);
            C51018qv3 qv32 = tz12.f142489d;
            if (qv32 != null) {
                i2 = qv32.computeSize();
            }
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(mo127649R7());
            Log.m105919d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", objArr);
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2.m39221h().mo57720g().mo61545Yt(mo127649R7(), tz12);
        }
    }

    /* renamed from: I7 */
    public void mo127640I7(Message message) {
        String string;
        String string2;
        switch (message.what) {
            case 131074:
                C102554b bVar = this.f268288j;
                if (bVar != null) {
                    bVar.notifyDataSetChanged();
                    return;
                }
                return;
            case 131075:
                if (this.f268288j != null && message.getData() != null && (string = message.getData().getString("product_id")) != null) {
                    this.f268288j.mo142178q(string, message.getData().getInt("progress"));
                    return;
                }
                return;
            case StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON:
                if (this.f268288j != null && message.getData() != null && (string2 = message.getData().getString("product_id")) != null) {
                    this.f268288j.mo141911r(string2, message.getData().getInt("status"));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: J7 */
    public void mo127641J7(C46439j jVar) {
        mo127664g8(jVar.f125078f, 0);
    }

    /* renamed from: K7 */
    public void mo127642K7(int i, int i2, String str, C46443q qVar) {
        int i3 = i;
        int i4 = i2;
        C46443q qVar2 = qVar;
        int i5 = -1;
        if (qVar2 == null || qVar2.f125103f != mo127649R7()) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(mo127649R7());
            if (qVar2 != null) {
                i5 = qVar2.f125103f;
            }
            objArr[1] = Integer.valueOf(i5);
            Log.m105925i("MicroMsg.emoji.BaseEmojiStoreUI", "no some scene type. this ui type:%d callbak type:%d", objArr);
            return;
        }
        this.f268294s = false;
        View view = this.f268295t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C41053r rVar = null;
        try {
            rVar = C46443q.m51751k1(qVar.mo71839l1());
        } catch (Exception e) {
            Log.printInfoStack("MicroMsg.emoji.BaseEmojiStoreUI", "deal NetGetEmotionList error:%s", e.toString());
        }
        if (rVar != null) {
            if (i3 == 0 || i3 == 4) {
                View view3 = this.f268290o;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionList", "(IILjava/lang/String;Lcom/tencent/mm/plugin/emoji/net/NetSceneGetEmotionList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f268292q = false;
                this.f268296u = qVar2.f125110p;
                if (i4 == 0) {
                    C51468tz1 l1 = qVar.mo71839l1();
                    mo127654W7(rVar, false, true);
                    if (this.f268293r == -1) {
                        Message obtain = Message.obtain();
                        obtain.what = 65537;
                        obtain.obj = l1;
                        EmojiBaseActivity.C93129a aVar3 = this.f268407d;
                        if (aVar3 != null) {
                            aVar3.sendMessage(obtain);
                        }
                    }
                    this.f268293r = 0;
                    return;
                } else if (i4 == 2) {
                    C51468tz1 l15 = qVar.mo71839l1();
                    mo127663f8(this.f268293r, rVar, false, false);
                    C102555c.m135404b(this.f268288j.f301966e, this);
                    if (this.f268293r == -1) {
                        Message obtain2 = Message.obtain();
                        obtain2.what = 65537;
                        obtain2.obj = l15;
                        EmojiBaseActivity.C93129a aVar4 = this.f268407d;
                        if (aVar4 != null) {
                            aVar4.sendMessage(obtain2);
                        }
                    }
                    this.f268293r = 2;
                    return;
                } else if (i4 == 3) {
                    mo127663f8(this.f268293r, rVar, false, false);
                    this.f268293r = 1;
                    return;
                } else {
                    View view5 = this.f268290o;
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListUnKnow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f268292q = true;
                    if (mo127649R7() == 7) {
                        this.f268291p.setText(C0966R.string.c_4);
                        return;
                    } else {
                        this.f268291p.setText(C0966R.string.c8p);
                        return;
                    }
                }
            }
        }
        if (!this.f268281E) {
            View view7 = this.f268290o;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar6.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "dealNetGetEmotionListErr", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268292q = true;
            this.f268291p.setText(C0966R.string.f360087a11);
        }
    }

    /* renamed from: L7 */
    public void mo127643L7() {
        ProgressDialog progressDialog = this.f268297v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f268297v.dismiss();
        }
    }

    /* renamed from: M7 */
    public void mo127644M7(boolean z, C41053r rVar, boolean z2, boolean z3) {
        C52077y70 y702;
        if (this.f268300y != null && z) {
            if (mo127656Y7()) {
                C41053r rVar2 = this.f268300y;
                if (rVar2 == null || (y702 = rVar2.f110541c) == null || y702.f145151d == null) {
                    Log.m105918d("MicroMsg.emoji.BaseEmojiStoreUI", "update store ui header failed. ");
                } else {
                    LinkedList<C52077y70> linkedList = (LinkedList) rVar2.f110542d;
                    this.f268282F = linkedList;
                    LinkedList<C101754a80> linkedList2 = (LinkedList) rVar2.f110543e;
                    this.f268283G = linkedList2;
                    if (linkedList != null) {
                        this.f268284f.mo127766d(linkedList, linkedList2);
                    } else {
                        LinkedList<C52077y70> linkedList3 = new LinkedList<>();
                        this.f268282F = linkedList3;
                        linkedList3.add(this.f268300y.f110541c);
                        this.f268284f.mo127766d(this.f268282F, this.f268283G);
                    }
                }
            }
            C102554b bVar = this.f268288j;
            if (bVar != null) {
                MMHandlerThread.postToMainThread(new C102553a(bVar, this.f268300y));
            }
            if (this.f268278B) {
                this.f268278B = false;
                C119179t tVar = C119157j.f356862d;
                BaseEmojiStoreUI$$a baseEmojiStoreUI$$a = new BaseEmojiStoreUI$$a(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(baseEmojiStoreUI$$a, 500, false);
            }
        }
    }

    /* renamed from: N7 */
    public abstract int mo127645N7();

    /* renamed from: O7 */
    public EmoticonStoreActionStruct mo127646O7(int i, C101038b bVar) {
        return null;
    }

    /* renamed from: P7 */
    public byte[] mo127647P7() {
        return null;
    }

    /* renamed from: Q7 */
    public int mo127648Q7(byte[] bArr) {
        return this.f268299x;
    }

    /* renamed from: R7 */
    public abstract int mo127649R7();

    /* renamed from: S7 */
    public abstract int mo127650S7();

    /* renamed from: T7 */
    public int mo127651T7() {
        return 0;
    }

    /* renamed from: U7 */
    public void mo127652U7(C102562g gVar, int i) {
        if (gVar == null) {
            Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "item is null.");
        } else if (gVar.f301982a == C102562g.C102563a.cellset) {
            C101754a80 a802 = gVar.f301984c;
            if (a802 == null) {
                Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "banner set is null. do nothing");
            } else {
                C98605n.m128199a(getContext(), a802, false);
            }
        } else {
            C101824o80 o802 = gVar.f301983b;
            if (o802 == null) {
                Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "summary is null. do nothing");
                return;
            }
            String stringExtra = getIntent().getStringExtra("to_talker_name");
            if (this instanceof EmojiStoreV3TopicUI) {
                C101038b bVar = new C101038b(i, o802.f298996f, o802);
                C98605n.m128202d(getContext(), o802, false, mo127645N7(), gVar.f301987f, gVar.f301986e, stringExtra, mo127650S7(), mo127646O7(4, bVar));
                mo127659b8(3, bVar);
                return;
            }
            C98605n.m128201c(getContext(), o802, false, mo127645N7(), gVar.f301987f, gVar.f301986e, stringExtra, mo127650S7());
        }
    }

    /* renamed from: V7 */
    public void mo127653V7() {
        C102554b a8 = mo127658a8();
        this.f268288j = a8;
        a8.f301967f = this;
    }

    /* renamed from: W7 */
    public void mo127654W7(C41053r rVar, boolean z, boolean z2) {
        Log.m105918d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks initData begin");
        if (rVar != null && rVar.f110540b.size() > 0) {
            this.f268281E = true;
            View view = this.f268290o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initData", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initData", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268292q = false;
        }
        mo127663f8(this.f268293r, rVar, z, z2);
        C102555c.m135404b(this.f268288j.f301966e, this);
    }

    /* renamed from: X7 */
    public void mo127655X7() {
        MMPullDownView mMPullDownView = (MMPullDownView) findViewById(C0966R.C0970id.g2v);
        this.f268289n = mMPullDownView;
        if (mMPullDownView != null) {
            mMPullDownView.setTopViewVisible(false);
            this.f268289n.setAtTopCallBack(this);
            this.f268289n.setOnBottomLoadDataListener(this);
            this.f268289n.setAtBottomCallBack(this);
            this.f268289n.setBottomViewVisible(false);
            this.f268289n.setIsBottomShowAll(false);
        }
    }

    /* renamed from: Y7 */
    public boolean mo127656Y7() {
        return !(this instanceof EmojiPaidUI);
    }

    /* renamed from: Z7 */
    public boolean mo127657Z7() {
        return false;
    }

    /* renamed from: a8 */
    public abstract C102554b mo127658a8();

    /* renamed from: b0 */
    public boolean mo64386b0() {
        return false;
    }

    /* renamed from: b8 */
    public void mo127659b8(int i, C101038b bVar) {
    }

    /* renamed from: c0 */
    public void mo127624c0(String str, String str2, String str3, String str4, String str5) {
        this.f268280D = new C46439j(str, str2, str3, str4, str5);
        C86709a0.m107529k().f251779b.mo123460f(this.f268280D);
    }

    /* renamed from: c8 */
    public void mo127660c8(C46443q qVar) {
    }

    /* renamed from: d8 */
    public void mo127661d8() {
        if (isFinishing()) {
            Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
            return;
        }
        this.f268297v = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new BaseEmojiStoreUI$$b(this));
    }

    /* renamed from: e8 */
    public void mo127662e8(boolean z, boolean z2) {
        C46443q qVar;
        this.f268294s = true;
        if (z) {
            View view = this.f268295t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "startLoadRemoteEmoji", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        byte[] bArr = this.f268296u;
        int R7 = mo127649R7();
        int Q7 = mo127648Q7(bArr);
        int T7 = mo127651T7();
        if (bArr != null) {
            Log.m105925i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer %s", bArr.toString());
            qVar = new C46443q(R7, bArr, Q7, false);
            if (R7 == 7) {
                qVar.f125105h = T7;
            }
        } else {
            Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer is null.");
            qVar = new C46443q(R7, Q7);
            if (R7 == 7) {
                qVar.f125105h = T7;
            }
        }
        qVar.f125106i = mo127647P7();
        mo127660c8(qVar);
        this.f268298w = qVar;
        C86709a0.m107529k().f251779b.mo123460f(this.f268298w);
        Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
        if (!z && !z2) {
            mo127661d8();
        }
    }

    /* renamed from: f8 */
    public void mo127663f8(int i, C41053r rVar, boolean z, boolean z2) {
        Log.m105918d("MicroMsg.emoji.BaseEmojiStoreUI", "");
        boolean z3 = true;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    this.f268300y = rVar;
                } else if (i == 2) {
                    if (this.f268300y == null) {
                        this.f268300y = new C41053r();
                    }
                    if (rVar != null) {
                        C41053r rVar2 = this.f268300y;
                        rVar2.f110539a += rVar.f110539a;
                        rVar2.mo64091b(rVar.f110540b, 2);
                    }
                }
            }
            z3 = false;
        } else {
            this.f268300y = rVar;
        }
        C41053r rVar3 = this.f268300y;
        if (rVar3 != null) {
            rVar3.mo64090a();
        }
        mo127644M7(z3, this.f268300y, z, z2);
    }

    /* renamed from: g2 */
    public void mo5537g2(ArrayList<C6653c1> arrayList) {
        Log.m105918d("MicroMsg.emoji.BaseEmojiStoreUI", "google [onQueryFinish]");
        C102554b bVar = this.f268288j;
        if (bVar != null) {
            C102555c.m135403a(arrayList, bVar.f301966e);
            EmojiBaseActivity.C93130b bVar2 = this.f268408e;
            if (bVar2 != null) {
                bVar2.removeMessages(131074);
                this.f268408e.sendEmptyMessage(131074);
            }
        }
    }

    /* renamed from: g8 */
    public final void mo127664g8(String str, int i) {
        Message obtain = Message.obtain();
        obtain.getData().putString("product_id", str);
        obtain.getData().putInt("progress", i);
        obtain.what = 131075;
        EmojiBaseActivity.C93130b bVar = this.f268408e;
        if (bVar != null) {
            bVar.sendMessage(obtain);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2j;
    }

    /* renamed from: i8 */
    public final void mo127665i8(String str, int i) {
        Message obtain = Message.obtain();
        obtain.getData().putString("product_id", str);
        obtain.getData().putInt("status", i);
        obtain.what = StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON;
        EmojiBaseActivity.C93130b bVar = this.f268408e;
        if (bVar != null) {
            bVar.sendMessage(obtain);
        }
    }

    public final void init() {
        mo127662e8(false, false);
        if (f268276H == null) {
            f268276H = new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("MicroMsg.emoji.BaseEmojiStoreUI", "refresh last net refresh time: %d", Long.valueOf(currentTimeMillis));
        f268276H.put(getClass().toString(), Long.valueOf(currentTimeMillis));
    }

    public void initView() {
        setBackBtn(new BaseEmojiStoreUI$$c(this, (C93159a) null));
        mo127653V7();
        View findViewById = findViewById(C0966R.C0970id.cig);
        this.f268290o = findViewById;
        this.f268291p = (TextView) findViewById.findViewById(C0966R.C0970id.cip);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.a2i, (ViewGroup) null);
        this.f268295t = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "initMoreBottom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (mo127656Y7()) {
            this.f268284f = new EmojiStoreVpHeader(getContext());
        }
        if (mo127657Z7()) {
            this.f268285g = LayoutInflater.from(this).inflate(C0966R.C0971layout.a3a, (ViewGroup) null);
            int i = EmojiStoreVpHeader.m117650a(getContext())[0];
            this.f268285g.setLayoutParams(new AbsListView.LayoutParams(i, ((i * 3) / 8) + 1));
            this.f268286h = (StoreBannerEmojiView) this.f268285g.findViewById(C0966R.C0970id.ce7);
        }
        ListView listView = (ListView) findViewById(16908298);
        this.f268287i = listView;
        listView.setOnItemClickListener(this);
        if (mo127656Y7()) {
            this.f268287i.addHeaderView(this.f268284f);
        } else if (mo127657Z7()) {
            this.f268287i.addHeaderView(this.f268285g);
        }
        this.f268287i.addFooterView(this.f268295t);
        this.f268287i.setAdapter(this.f268288j);
        this.f268287i.setOnScrollListener(this);
        this.f268288j.getClass();
        mo127655X7();
    }

    /* renamed from: k5 */
    public void mo127623k5(C102330b bVar) {
        Object[] objArr = new Object[3];
        objArr[0] = bVar.mo141886e();
        objArr[1] = TextUtils.isEmpty(bVar.mo141887f()) ? "" : bVar.mo141887f();
        objArr[2] = Integer.valueOf(bVar.mo141888g());
        Log.m105925i("MicroMsg.emoji.BaseEmojiStoreUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        if (bVar.mo141888g() == 9) {
            String string = getString(C0966R.string.a3p);
            if (isFinishing()) {
                Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
            } else {
                this.f268297v = C76879j.m92723Q(this, getString(C0966R.string.a3h), string, true, true, new C93162c(this));
            }
        }
        EmoticonStoreActionStruct O7 = mo127646O7(2, (C101038b) null);
        if ((this instanceof EmojiStoreV3TopicUI) && O7 != null) {
            this.f268301z.f268245k = O7;
        }
        this.f268301z.mo127620c(bVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105918d("MicroMsg.emoji.BaseEmojiStoreUI", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        super.onActivityResult(i, i2, intent);
        this.f268301z.mo127619b(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C92054g.class;
        super.onCreate(bundle);
        this.f268301z = new C93108e0();
        initView();
        this.f268299x = getIntent().getIntExtra("preceding_scence", 2);
        ((C92054g) C86312j.m106911c(cls)).getClass();
        if (C30790w2.m39221h().mo57715b() != null) {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57715b().add(this);
        }
        EmotionStatusChangeL emotionStatusChangeL = new EmotionStatusChangeL();
        this.f268277A = emotionStatusChangeL;
        emotionStatusChangeL.alive();
        C93108e0 e0Var = this.f268301z;
        e0Var.f268238d = this;
        e0Var.f268235a = this.f268288j;
        e0Var.f268240f = mo127645N7();
        this.f268301z.f268241g = this;
        init();
    }

    public void onDestroy() {
        EmojiStoreVpHeader emojiStoreVpHeader;
        super.onDestroy();
        C102554b bVar = this.f268288j;
        if (bVar != null) {
            bVar.mo141905a();
            this.f268288j = null;
        }
        if (mo127656Y7() && (emojiStoreVpHeader = this.f268284f) != null) {
            C102344i iVar = emojiStoreVpHeader.f268668i;
            if (iVar != null) {
                LinkedList<C93101b> linkedList = iVar.f301440e;
                if (linkedList != null) {
                    linkedList.clear();
                }
                ArrayList<String> arrayList = iVar.f301444i;
                if (arrayList != null) {
                    arrayList.clear();
                }
                iVar.f301443h = true;
                iVar.f301445j.f301446a = null;
                emojiStoreVpHeader.f268668i = null;
            }
            emojiStoreVpHeader.f268671o = null;
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(this);
        this.f268277A.dead();
        C86709a0.m107529k().f251779b.mo123458d(this.f268280D);
        C93108e0 e0Var = this.f268301z;
        if (e0Var != null) {
            e0Var.f268235a = null;
            e0Var.f268241g = null;
            e0Var.f268238d = null;
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (mo127656Y7() || mo127657Z7()) {
            if (i == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            i--;
        }
        if (i < 0 || i >= this.f268288j.getCount()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        mo127652U7(this.f268288j.getItem(i), i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (!TextUtils.isEmpty(str) && str.equals("delete_group")) {
            EmojiBaseActivity.C93130b bVar = this.f268408e;
            if (bVar != null) {
                bVar.removeMessages(131074);
            }
            EmojiBaseActivity.C93130b bVar2 = this.f268408e;
            if (bVar2 != null) {
                bVar2.sendEmptyMessageDelayed(131074, (long) 50);
            }
        }
    }

    public void onPause() {
        EmojiStoreVpHeader emojiStoreVpHeader;
        super.onPause();
        C86709a0.m107529k().f251779b.mo123470p(411, this);
        C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodSetNgStrength, this);
        C86709a0.m107529k().f251779b.mo123470p(413, this);
        C86709a0.m107529k().f251779b.mo123470p(717, this);
        C86709a0.m107529k().f251779b.mo123458d(this.f268298w);
        if (!(!mo127656Y7() || (emojiStoreVpHeader = this.f268284f) == null || emojiStoreVpHeader.f268671o == null)) {
            emojiStoreVpHeader.f268672p = false;
            emojiStoreVpHeader.f268671o.removeMessages(0);
        }
        this.f268279C = true;
    }

    public void onResume() {
        C102556d dVar;
        EmojiStoreVpHeader emojiStoreVpHeader;
        super.onResume();
        C86709a0.m107529k().f251779b.mo123455a(411, this);
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodSetNgStrength, this);
        C86709a0.m107529k().f251779b.mo123455a(413, this);
        C86709a0.m107529k().f251779b.mo123455a(717, this);
        if (mo127656Y7() && (emojiStoreVpHeader = this.f268284f) != null) {
            emojiStoreVpHeader.mo127767e();
        }
        this.f268301z.f268236b = false;
        C102554b bVar = this.f268288j;
        if (bVar != null && (dVar = bVar.f301966e) != null) {
            dVar.mo142180f();
            this.f268288j.mo142175k();
            if (this.f268279C && (this instanceof EmojiStoreV3TopicUI)) {
                mo127659b8(1, (C101038b) null);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = TextUtils.isEmpty(str) ? "" : str;
        Log.m105925i("MicroMsg.emoji.BaseEmojiStoreUI", "jacks [onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        mo127643L7();
        int type = yVar.getType();
        if (type != 411) {
            if (type == 413) {
                C46445t tVar = (C46445t) yVar;
                if (i == 0 && i2 == 0) {
                    ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                    C30790w2.m39221h().mo57715b().mo142021Ow(tVar.f125114f);
                    Message message = new Message();
                    message.what = 2002;
                    message.obj = getContext().getString(C0966R.string.a3m);
                    EmojiBaseActivity.C93130b bVar = this.f268408e;
                    if (bVar != null) {
                        bVar.sendMessage(message);
                    }
                } else {
                    Message message2 = new Message();
                    message2.what = 2002;
                    message2.obj = getContext().getString(C0966R.string.c5t);
                    EmojiBaseActivity.C93130b bVar2 = this.f268408e;
                    if (bVar2 != null) {
                        bVar2.sendMessage(message2);
                    }
                }
                EmojiBaseActivity.C93130b bVar3 = this.f268408e;
                if (bVar3 != null) {
                    bVar3.sendEmptyMessageDelayed(20001, (long) 800);
                }
            } else if (type != 423) {
                if (type != 717) {
                    Log.m105920e("MicroMsg.emoji.BaseEmojiStoreUI", "unknow scene type");
                } else if (i == 0 && i2 == 0) {
                    this.f268296u = null;
                    mo127662e8(false, true);
                }
            } else if (yVar instanceof C46439j) {
                C46439j jVar = (C46439j) yVar;
                if (i == 0 && i2 == 0) {
                    mo127641J7(jVar);
                    return;
                }
                String str2 = jVar.f125078f;
                String str3 = jVar.f125080h;
                String str4 = jVar.f125079g;
                C76879j.m92750u(this, getString(C0966R.string.c8f, new Object[]{str4}), "", new C93159a(this, str2, str3, str4, jVar.f125082j), new C93160b(this));
                mo127665i8(jVar.f125078f, -1);
            }
        } else if (yVar instanceof C46443q) {
            mo127642K7(i, i2, str, (C46443q) yVar);
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
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f268293r == 0 || this.f268294s) {
                Log.m105918d("MicroMsg.emoji.BaseEmojiStoreUI", "No More List.");
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            mo127662e8(true, false);
            Log.m105924i("MicroMsg.emoji.BaseEmojiStoreUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
        }
        if (i == 0 && (this instanceof EmojiStoreV3TopicUI)) {
            mo127659b8(1, (C101038b) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    /* renamed from: q0 */
    public boolean mo64384q0() {
        return false;
    }

    /* renamed from: z4 */
    public void mo127625z4(boolean z) {
        this.f268296u = null;
        this.f268293r = -1;
        mo127662e8(z, false);
    }
}
