package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import b63.C67195n;
import c63.C67345b;
import c63.C67346c;
import c63.C67347d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RequestEnterWalletEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.mall.p075ui.C69771c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ie3.C87716k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ke3.C88144b;
import kr0.C76632y0;
import kr0.C88262c1;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p281yz.C79173v;
import p755xs.C102720b;
import s52.C36626n;
import s52.C48230g;
import vt1.C78473a;
import x53.C78770a;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexBaseUI */
public abstract class MallIndexBaseUI extends WalletBaseUI implements C102720b.C78973a, C67195n {

    /* renamed from: u */
    public static final /* synthetic */ int f201165u = 0;

    /* renamed from: d */
    public ListView f201166d = null;

    /* renamed from: e */
    public C69771c f201167e = null;

    /* renamed from: f */
    public TextView f201168f = null;

    /* renamed from: g */
    public TextView f201169g;

    /* renamed from: h */
    public String f201170h;

    /* renamed from: i */
    public ArrayList<MallFunction> f201171i = null;

    /* renamed from: j */
    public String f201172j = null;

    /* renamed from: n */
    public String f201173n = null;

    /* renamed from: o */
    public boolean f201174o = true;

    /* renamed from: p */
    public int f201175p;

    /* renamed from: q */
    public int f201176q;

    /* renamed from: r */
    public View f201177r;

    /* renamed from: s */
    public View f201178s;

    /* renamed from: t */
    public boolean f201179t = false;

    static {
        WeChatHosts.domainString(C0966R.string.fls);
    }

    /* renamed from: H7 */
    public abstract void mo95931H7();

    /* renamed from: I7 */
    public abstract void mo95932I7();

    /* renamed from: J7 */
    public final MallFunction mo95933J7(List<MallFunction> list) {
        if (!(list == null || list.size() == 0 || TextUtils.isEmpty(this.f201172j))) {
            for (int i = 0; i < list.size(); i++) {
                MallFunction mallFunction = list.get(i);
                if (mallFunction != null && this.f201172j.equals(mallFunction.f209731d)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    /* renamed from: K7 */
    public final MallFunction mo95934K7(List<MallFunction> list) {
        if (!(list == null || list.size() == 0 || TextUtils.isEmpty(this.f201173n))) {
            for (int i = 0; i < list.size(); i++) {
                MallFunction mallFunction = list.get(i);
                if (mallFunction != null && this.f201173n.equals(mallFunction.f209736i)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    /* renamed from: L7 */
    public void mo95935L7(MallFunction mallFunction, int i) {
        MallFunction mallFunction2 = mallFunction;
        if (mallFunction2 != null && i >= 0) {
            MallNews mallNews = mallFunction2.f209739o;
            String str = (mallNews == null || Util.isNullOrNil(mallNews.f209746g)) ? "" : mallFunction2.f209739o.f209746g;
            ArrayList<MallFunction> arrayList = this.f201171i;
            int size = arrayList == null ? 0 : arrayList.size();
            boolean d = C69771c.m82209d(mallFunction);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[10];
            objArr[0] = mallFunction2.f209731d;
            objArr[1] = Integer.valueOf(size);
            objArr[2] = 0;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = str;
            objArr[5] = Integer.valueOf(d ? 2 : 1);
            objArr[6] = 1;
            objArr[7] = 0;
            objArr[8] = 0;
            objArr[9] = 0;
            nVar.mo160131h(10881, objArr);
        }
        if (mallFunction2 == null || Util.isNullOrNil(mallFunction2.f209736i) || !((C76632y0) C86312j.m106911c(C76632y0.class)).mo106904s8(mallFunction2.f209736i, (Bundle) null)) {
            int a = C69797s.m82221a(mallFunction);
            Log.m105924i("MicroMsg.MallIndexBaseUI", "functionType : " + a);
            switch (a) {
                case 0:
                    Intent intent = new Intent();
                    if (isTransparent()) {
                        intent.putExtra("key_is_hide_progress", true);
                    }
                    intent.putExtra("key_func_info", mallFunction2);
                    C88144b.m109791i(this, "recharge", ".ui.PhoneRechargeUI", intent, (Bundle) null);
                    C75136r0.m90122d(15, 0);
                    return;
                case 1:
                    C86709a0.m107528h();
                    this.f201175p = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                    Intent intent2 = new Intent();
                    intent2.putExtra("rawUrl", mallFunction2.f209737j);
                    intent2.putExtra("geta8key_username", C75592q0.m90789s());
                    intent2.putExtra("pay_channel", 1);
                    intent2.putExtra("KPublisherId", "pay_wallet");
                    intent2.putExtra("key_download_restrict", mallFunction2.f209742r);
                    intent2.putExtra("key_wallet_region", this.f201175p);
                    intent2.putExtra("key_function_id", mallFunction2.f209731d);
                    intent2.putExtra(C74928u.C45093i.f122326r, true);
                    intent2.putExtra("geta8key_scene", 46);
                    C75228t.m90217J(getContext(), intent2);
                    return;
                case 2:
                    Log.m105928w("MicroMsg.MallIndexBaseUI", "doSelectFunction no jump");
                    return;
                case 3:
                    Log.m105928w("MicroMsg.MallIndexBaseUI", "doSelectFunction do nothing");
                    C76912y0.makeText((Context) this, (CharSequence) "fuction list error", 1).show();
                    return;
                case 4:
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.mo160131h(11701, 0, 0, 0, 0, 1);
                    Intent intent3 = new Intent();
                    intent3.putExtra("pay_channel", 1);
                    C88144b.m109791i(this, "luckymoney", ".ui.LuckyMoneyIndexUI", intent3, (Bundle) null);
                    C75136r0.m90122d(13, 0);
                    nVar2.mo160131h(11850, 4, 0);
                    return;
                case 5:
                    C115669n nVar3 = C115669n.INSTANCE;
                    nVar3.mo160131h(11458, 1);
                    if (C75592q0.m90763K()) {
                        LinkedList linkedList = new LinkedList();
                        LinkedList linkedList2 = new LinkedList();
                        linkedList.add(getString(C0966R.string.i3a));
                        linkedList2.add(0);
                        linkedList.add(getString(C0966R.string.bhi));
                        linkedList2.add(1);
                        C76879j.m92733d(this, getString(C0966R.string.i0f), linkedList, linkedList2, (String) null, true, new C69787j(this));
                    } else {
                        C86709a0.m107528h();
                        C85801v1 i2 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MALL_INDEX_HAS_SHOWN_FTF_NOTICE_BOOLEAN;
                        if (!((Boolean) i2.mo119685f(aVar, Boolean.FALSE)).booleanValue()) {
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                            C76879j.m92749t(this, getString(C0966R.string.ku6), "", new C69788k(this));
                        } else {
                            mo95940Q7();
                        }
                    }
                    C75136r0.m90122d(14, 0);
                    nVar3.mo160131h(11850, 3, 0);
                    return;
                case 6:
                    Intent intent4 = new Intent();
                    intent4.putExtra("key_from_scene", 1);
                    C88144b.m109791i(getContext(), "offline", ".ui.WalletOfflineEntranceUI", intent4, (Bundle) null);
                    C75136r0.m90122d(9, 0);
                    C115669n.INSTANCE.mo160131h(11850, 5, 0);
                    return;
                case 7:
                    Intent intent5 = new Intent();
                    if (isTransparent()) {
                        intent5.putExtra("key_is_hide_progress", true);
                    }
                    intent5.putExtra("key_func_info", mallFunction2);
                    C88144b.m109791i(this, "recharge", ".ui.RechargeUI", intent5, (Bundle) null);
                    return;
                case 8:
                    Intent intent6 = new Intent();
                    intent6.putExtra("BaseScanUI_select_scan_mode", 1);
                    intent6.putExtra("key_scan_report_enter_scene", 3);
                    C88144b.m109791i(getContext(), "scanner", ".ui.BaseScanUI", intent6, (Bundle) null);
                    return;
                case 9:
                    C88144b.m109789g(getContext(), "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
                    return;
                default:
                    return;
            }
        } else {
            Log.m105925i("MicroMsg.MallIndexBaseUI", "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s", mallFunction2.f209736i);
            C67346c.m79699b().mo91481f(mallFunction2.f209731d);
            C67347d.m79705b().mo91485d(mallFunction2.f209731d);
            if (mallFunction2.f209739o != null) {
                C67346c.m79699b().mo91480d(mallFunction2);
            }
        }
    }

    /* renamed from: M7 */
    public abstract void mo95936M7();

    /* renamed from: N7 */
    public abstract boolean mo95937N7();

    /* renamed from: O7 */
    public abstract void mo95938O7(View view);

    /* renamed from: P7 */
    public abstract void mo95939P7();

    /* renamed from: Q7 */
    public final void mo95940Q7() {
        if (C75592q0.m90763K()) {
            C79143a.m95772k(getContext(), "wallet_payu", "PayURemittanceProcess", (Bundle) null, (C79148e.C79149a) null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("pay_channel", 1);
        C79143a.m95772k(getContext(), "remittance", "RemittanceProcess", bundle, (C79148e.C79149a) null);
    }

    /* renamed from: R7 */
    public abstract void mo95941R7();

    /* renamed from: S7 */
    public abstract void mo95942S7();

    /* renamed from: T7 */
    public abstract void mo95943T7();

    /* renamed from: U7 */
    public abstract void mo95944U7();

    /* renamed from: V7 */
    public abstract void mo95945V7();

    /* renamed from: W7 */
    public abstract void mo95946W7();

    /* renamed from: X7 */
    public void mo95947X7() {
        boolean z;
        ArrayList arrayList;
        int i;
        showOptionMenu(true);
        C69771c cVar = this.f201167e;
        ArrayList<MallFunction> arrayList2 = this.f201171i;
        ((ArrayList) cVar.f201328d).clear();
        if (arrayList2 != null) {
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                while (i3 < 3) {
                    int i4 = i2 + i3;
                    if (i4 >= arrayList2.size() || (i3 > 0 && i4 - 1 >= 0 && arrayList2.get(i).f209740p != arrayList2.get(i4).f209740p)) {
                        break;
                    }
                    C69771c.C69776e eVar = new C69771c.C69776e(cVar);
                    eVar.f201363b = i4;
                    eVar.f201362a = arrayList2.get(i4);
                    arrayList3.add(eVar);
                    i3++;
                }
                if (arrayList3.size() > 0) {
                    ((ArrayList) cVar.f201328d).add(arrayList3);
                }
                i2 += i3;
            }
            cVar.f201335n = 0;
            cVar.f201336o = 0;
            Iterator it = ((ArrayList) cVar.f201328d).iterator();
            int i5 = -1;
            while (it.hasNext()) {
                ArrayList arrayList4 = (ArrayList) it.next();
                if (arrayList4.size() > 0) {
                    if (i5 != -1 && i5 != ((C69771c.C69776e) arrayList4.get(0)).f201362a.f209740p) {
                        break;
                    }
                    cVar.f201335n += arrayList4.size();
                    cVar.f201336o++;
                    i5 = ((C69771c.C69776e) arrayList4.get(0)).f201362a.f209740p;
                }
            }
            cVar.f201336o--;
        }
        cVar.f201329e = C36626n.vx0().xx0(cVar.f201333i).f77824y;
        if (((ArrayList) cVar.f201328d).size() > 3 && (arrayList = (ArrayList) ((ArrayList) cVar.f201328d).get(3)) != null && arrayList.size() > 0) {
            int i6 = ((C69771c.C69776e) arrayList.get(0)).f201362a.f209740p;
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                MallFunction mallFunction = ((C69771c.C69776e) it4.next()).f201362a;
                if (mallFunction.f209740p == i6) {
                    if (C69771c.m82209d(mallFunction)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        cVar.f201337p = z;
        Log.m105925i("MicroMsg.FunctionListAdapter", "hasMoreNewAtFirstSectionBottom: %s", Boolean.valueOf(z));
        cVar.notifyDataSetChanged();
        mo95931H7();
        mo95945V7();
    }

    public boolean checkProcLife() {
        return false;
    }

    public void finish() {
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bab;
    }

    public void initView() {
        Log.m105918d("MicroMsg.MallIndexBaseUI", "index initView");
        setBackBtn(new MallIndexBaseUI$$b(this));
        this.f201166d = (ListView) findViewById(C0966R.C0970id.gls);
        mo95939P7();
        mo95936M7();
        C69771c cVar = new C69771c(this, this.f201175p);
        this.f201167e = cVar;
        this.f201166d.setAdapter(cVar);
        this.f201167e.f201330f = new MallIndexBaseUI$$c(this);
        mo95938O7(this.f201177r);
        this.f201169g = (TextView) findViewById(C0966R.C0970id.a7l);
        mo95944U7();
    }

    public boolean isTransparent() {
        return !Util.isNullOrNil(this.f201172j) || !Util.isNullOrNil(this.f201173n);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
    }

    /* renamed from: k7 */
    public void mo91296k7(int i, Map<String, String> map, Object[] objArr) {
        if (i == 12 && this.f201168f != null) {
            mo95946W7();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            C86709a0.m107528h();
            this.f201175p = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (i2 != -1) {
                return;
            }
            if (C75592q0.m90753A()) {
                finish();
                return;
            }
            finish();
            RequestEnterWalletEvent requestEnterWalletEvent = new RequestEnterWalletEvent();
            requestEnterWalletEvent.f9428d.f9429a = getContext();
            requestEnterWalletEvent.publish();
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.MallIndexBaseUI", "onCreate");
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            Log.m105926v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
            finish();
        }
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f201175p = getIntent().getIntExtra("key_wallet_region", intValue);
        String stringExtra = getIntent().getStringExtra("key_uuid");
        this.f201170h = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f201170h = UUID.randomUUID().toString();
        }
        addSceneEndListener(C1643f.CTRL_INDEX);
        ((C79173v) C86312j.m106911c(C79173v.class)).Bx0().mo91291a(this);
        this.f201172j = getIntent().getStringExtra("key_func_id");
        Log.m105924i("MicroMsg.MallIndexBaseUI", "mFuncId:" + this.f201172j + " wallet_region: " + this.f201175p + " walletType: " + C75592q0.m90784n() + " default_region: " + intValue);
        this.f201173n = getIntent().getStringExtra("key_native_url");
        StringBuilder sb = new StringBuilder();
        sb.append("mNativeUrl:");
        sb.append(this.f201173n);
        Log.m105924i("MicroMsg.MallIndexBaseUI", sb.toString());
        if (!isTransparent()) {
            mo95932I7();
            setContentViewVisibility(0);
            Log.m105924i("MicroMsg.MallIndexBaseUI", "index Oncreate");
            mo95942S7();
            initView();
            C67346c.m79698a();
            mo95941R7();
            Log.m105924i("MicroMsg.MallIndexBaseUI", "hy: use default controller for MallIndexUI");
            mo95943T7();
            if (C75592q0.m90763K()) {
                Log.m105920e("MicroMsg.MallIndexBaseUI", "it is payu account ,not initFingerPrint");
            } else {
                C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
                if (aVar != null) {
                    Log.m105924i("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
                    aVar.Th0(this);
                } else {
                    Log.m105920e("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null");
                }
            }
            C75136r0.m90122d(1, 0);
            C115669n.INSTANCE.mo160131h(11850, 1, 0);
            Looper.myQueue().addIdleHandler(new MallIndexBaseUI$$a());
        }
    }

    public void onDestroy() {
        removeSceneEndListener(C1643f.CTRL_INDEX);
        ((C79173v) C86312j.m106911c(C79173v.class)).Bx0().mo91292b(this);
        super.onDestroy();
    }

    public boolean onProgressFinish() {
        if (isTransparent()) {
            return true;
        }
        mo95947X7();
        return true;
    }

    public void onResume() {
        super.onResume();
        boolean z = true;
        C87716k.f253994a = 1;
        Log.m105924i("MicroMsg.MallIndexBaseUI", "index onResume");
        if (!C86709a0.m107522a()) {
            Log.m105926v("MicroMsg.MallIndexBaseUI", "MMCore is not ready");
            finish();
        }
        if (isTransparent()) {
            ArrayList<MallFunction> wx02 = C36626n.vx0().wx0(this.f201175p);
            this.f201171i = wx02;
            if (wx02 == null || wx02.size() <= 0) {
                Log.m105924i("MicroMsg.MallIndexBaseUI", "mFunctionList == null");
                try {
                    if (getIntent().getIntExtra("key_scene", 0) != 1) {
                        if (Util.isNullOrNil(this.f201173n)) {
                            String stringExtra = getIntent().getStringExtra("key_url");
                            doSceneForceProgress(new C48230g(this.f201175p, C67345b.m79687a(), getIntent().getStringExtra("key_app_id"), this.f201172j, stringExtra == null ? "" : stringExtra, 0));
                            return;
                        }
                    }
                    doSceneForceProgress(new C48230g(this.f201175p, C67345b.m79687a(), 0));
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.MallIndexBaseUI", e, "", new Object[0]);
                    setResult(0);
                    finish();
                }
            } else {
                MallFunction J7 = mo95933J7(this.f201171i);
                if (J7 == null) {
                    J7 = mo95934K7(this.f201171i);
                }
                mo95935L7(J7, -1);
                finish();
            }
        } else {
            mo95937N7();
            Log.m105918d("MicroMsg.MallIndexBaseUI", "initFunctionList");
            if (C36626n.vx0().wx0(this.f201175p) == null) {
                doSceneProgress(new C48230g(this.f201175p, C67345b.m79687a(), 0), true);
                Log.m105920e("MicroMsg.MallIndexBaseUI", "funcitonlist invalid");
                z = false;
            } else {
                doSceneProgress(new C48230g(this.f201175p, C67345b.m79687a(), 1), false);
                this.f201171i = C36626n.vx0().wx0(this.f201175p);
            }
            if (z) {
                Log.m105924i("MicroMsg.MallIndexBaseUI", "has data");
                mo95947X7();
            }
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MallFunction mallFunction;
        C88262c1 c1Var;
        Log.m105918d("MicroMsg.MallIndexBaseUI", "onOtherSceneEnd");
        if (yVar instanceof C78770a) {
            Log.m105918d("MicroMsg.MallIndexBaseUI", "hy: query bound scene end");
            if (i != 0 || i2 != 0) {
                finish();
                return true;
            } else if (this.f201174o) {
                this.f201174o = false;
                if (((C79173v) C86312j.m106911c(C79173v.class)).Dx0().mo105873jo().field_is_reg == 0) {
                    C79143a.m95772k(this, "wallet_payu", "PayUOpenProcess", (Bundle) null, (C79148e.C79149a) null);
                    return true;
                }
            }
        }
        if (yVar.getType() != 495) {
            return false;
        }
        C48230g gVar = (C48230g) yVar;
        int i3 = gVar.f129221g;
        int i4 = this.f201175p;
        if (i3 != i4) {
            Log.m105925i("MicroMsg.MallIndexBaseUI", "pass wallet local: %d cgi: %d", Integer.valueOf(i4), Integer.valueOf(gVar.f129221g));
        }
        if (isTransparent()) {
            Log.m105919d("MicroMsg.MallIndexBaseUI", "errorType:%d | errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0 && gVar.f129218d != null) {
                if (getIntent().getIntExtra("key_scene", 0) == 1) {
                    MallFunction J7 = mo95933J7(gVar.f129218d);
                    if (J7 != null) {
                        mo95935L7(J7, -1);
                    }
                } else if (!Util.isNullOrNil(this.f201173n)) {
                    Log.m105919d("MicroMsg.MallIndexBaseUI", "NativeUrl: %s", this.f201173n);
                    MallFunction K7 = mo95934K7(gVar.f129218d);
                    if (K7 != null) {
                        mo95935L7(K7, -1);
                    } else {
                        setResult(0);
                        finish();
                        return true;
                    }
                } else {
                    ArrayList<MallFunction> arrayList = gVar.f129218d;
                    if (arrayList != null && arrayList.size() > 0) {
                        Log.m105924i("MicroMsg.MallIndexBaseUI", "functionScene.mFunctionList != null");
                        mo95935L7(mo95933J7(gVar.f129218d), -1);
                    } else if (C36626n.vx0().wx0(this.f201175p) == null || C36626n.vx0().wx0(this.f201175p).size() <= 0) {
                        Log.m105920e("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() == null");
                    } else {
                        Log.m105924i("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() != null");
                        mo95935L7(mo95933J7(C36626n.vx0().wx0(this.f201175p)), -1);
                    }
                }
                setResult(-1);
                finish();
            } else {
                setResult(0);
                finish();
            }
        } else {
            if (i == 0 && i2 == 0 && C36626n.vx0().wx0(this.f201175p) != null && gVar.f129218d != null) {
                this.f201171i = C36626n.vx0().wx0(this.f201175p);
                Log.m105924i("MicroMsg.MallIndexBaseUI", "get from server now! " + this.f201175p + " " + this.f201171i.size());
                C67346c b = C67346c.m79699b();
                ArrayList<MallFunction> arrayList2 = this.f201171i;
                b.getClass();
                if (arrayList2 != null) {
                    HashSet hashSet = new HashSet(((HashMap) b.f193199a).keySet());
                    Iterator<MallFunction> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(it.next().f209731d);
                    }
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        ((HashMap) b.f193199a).remove((String) it4.next());
                    }
                    b.mo91482g();
                }
                if (!Util.isNullOrNil((List) this.f201171i)) {
                    LinkedList linkedList = new LinkedList();
                    Iterator<MallFunction> it5 = this.f201171i.iterator();
                    while (it5.hasNext()) {
                        MallFunction next = it5.next();
                        if (!Util.isNullOrNil(next.f209736i)) {
                            linkedList.add(next.f209736i);
                        }
                    }
                    if (!Util.isNullOrNil((List) linkedList) && (c1Var = (C88262c1) C86312j.m106911c(C88262c1.class)) != null) {
                        c1Var.mo113584Yy(linkedList);
                    }
                }
            }
            mo95947X7();
            boolean booleanExtra = getIntent().getBooleanExtra("key_wallet_has_red", false);
            if (this.f201166d.getChildCount() != 0) {
                int firstVisiblePosition = this.f201166d.getFirstVisiblePosition();
                int top = this.f201166d.getChildAt(0).getTop();
                Log.m105925i("MicroMsg.MallIndexBaseUI", "initCheckNew %s fpos %s top %s", Boolean.valueOf(booleanExtra), Integer.valueOf(firstVisiblePosition), Integer.valueOf(top));
                if (firstVisiblePosition == 0 && top == 0 && booleanExtra && !this.f201179t && this.f201171i != null) {
                    this.f201179t = true;
                    int headerViewsCount = this.f201166d.getHeaderViewsCount() + this.f201167e.getCount();
                    List<ArrayList<C69771c.C69776e>> list = this.f201167e.f201328d;
                    if (list != null) {
                        ArrayList arrayList3 = (ArrayList) list;
                        int size = arrayList3.size() - 1;
                        while (true) {
                            if (size <= 0) {
                                break;
                            }
                            Iterator it6 = ((ArrayList) arrayList3.get(size)).iterator();
                            while (it6.hasNext()) {
                                C69771c.C69776e eVar = (C69771c.C69776e) it6.next();
                                if (eVar != null && (mallFunction = eVar.f201362a) != null && C69771c.m82209d(mallFunction)) {
                                    int firstVisiblePosition2 = this.f201166d.getFirstVisiblePosition();
                                    int lastVisiblePosition = this.f201166d.getLastVisiblePosition();
                                    Log.m105925i("MicroMsg.MallIndexBaseUI", "get listview show top %s bottom %s redPos: %d", Integer.valueOf(firstVisiblePosition2), Integer.valueOf(lastVisiblePosition), Integer.valueOf(headerViewsCount));
                                    if (headerViewsCount < firstVisiblePosition2 || headerViewsCount > lastVisiblePosition) {
                                        int i5 = C69770b.f201322c;
                                        int i6 = C69770b.f201325f;
                                        int i7 = C69770b.f201323d;
                                        int i8 = i6 + ((headerViewsCount + 1) * i7) + i5;
                                        if (headerViewsCount > 2) {
                                            i8 += i5;
                                        }
                                        if (headerViewsCount > 3) {
                                            i8 += i5;
                                        }
                                        int scrollY = (i8 + (i7 / 3)) - this.f201166d.getScrollY();
                                        int i9 = C85875k4.m106184h(this).y;
                                        if (C85875k4.m106190k(this)) {
                                            i9 -= C85875k4.m106188j(this);
                                        }
                                        if (getSupportActionBar() != null) {
                                            i9 -= getSupportActionBar().mo91101l();
                                        }
                                        this.f201166d.smoothScrollBy(scrollY - i9, 1000);
                                    }
                                }
                            }
                            headerViewsCount--;
                            size--;
                        }
                    }
                }
            }
            mo95936M7();
        }
        return true;
    }

    public void onStop() {
        super.onStop();
    }

    public void setStatusColor() {
    }

    public void shouldFixStatusBar() {
    }
}
