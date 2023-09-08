package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75129p;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1136n3.C109678b;
import te3.C77933g43;
import te3.C77935gl2;
import te3.C77947ig2;
import te3.ej4;
import te3.gj4;
import te3.kj4;
import wc3.C78538u;
import wi2.C53181d;
import xi2.C78843b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI */
public class MobileRemitNumberInputUI extends MobileRemitBaseUI {

    /* renamed from: v */
    public static final /* synthetic */ int f203879v = 0;

    /* renamed from: d */
    public InputPanelFrameLayout f203880d;

    /* renamed from: e */
    public RelativeLayout f203881e;

    /* renamed from: f */
    public LinearLayout f203882f;

    /* renamed from: g */
    public TextView f203883g;

    /* renamed from: h */
    public TextView f203884h;

    /* renamed from: i */
    public TextView f203885i;

    /* renamed from: j */
    public WalletFormView f203886j;

    /* renamed from: n */
    public Button f203887n;

    /* renamed from: o */
    public View f203888o;

    /* renamed from: p */
    public View f203889p;

    /* renamed from: q */
    public WcPayBannerView f203890q;

    /* renamed from: r */
    public kj4 f203891r;

    /* renamed from: s */
    public boolean f203892s;

    /* renamed from: t */
    public int f203893t = 0;

    /* renamed from: u */
    public String f203894u;

    /* renamed from: I7 */
    public final void mo97205I7(boolean z) {
        int height = ((WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
        int b = C76577a.m92151b(getContext(), 96);
        int b2 = C76577a.m92151b(getContext(), 64);
        int b3 = C76577a.m92151b(getContext(), 48);
        int b4 = C76577a.m92151b(getContext(), 40);
        int h = (height - C75044y4.m89996h(getContext())) - C78538u.m94865a(getContext());
        if (z) {
            b = b2;
        }
        int i = h - b4;
        int i2 = this.f203893t;
        int i3 = (i - i2) - b;
        if ((i - i2) - b < this.f203888o.getBottom() + b3) {
            i3 = this.f203888o.getBottom() + b3;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.f203889p.getTop(), (float) i3});
        ofFloat.setDuration(1000);
        ofFloat.setInterpolator(new C109678b());
        ofFloat.setDuration(175);
        WeakReference weakReference = new WeakReference(this.f203889p);
        ofFloat.addUpdateListener(new MobileRemitNumberInputUI$$a(weakReference));
        ofFloat.addListener(new MobileRemitNumberInputUI$$c(this, weakReference, i3));
        ofFloat.start();
    }

    /* renamed from: J7 */
    public final void mo97206J7() {
        String str;
        String str2;
        Object[] objArr = new Object[1];
        kj4 kj4 = this.f203891r;
        int i = C53181d.f148365u;
        if (kj4 == null) {
            str = "TransferPhoneHomePageResp{null}";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("TransferPhoneHomePageResp{ret_code=");
            sb.append(kj4.f136821d);
            sb.append(", ret_msg='");
            sb.append(kj4.f136822e);
            sb.append('\'');
            sb.append(", title='");
            sb.append(kj4.f136823f);
            sb.append('\'');
            sb.append(", subtitle='");
            sb.append(kj4.f136824g);
            sb.append('\'');
            sb.append(", has_his_rcvr=");
            sb.append(kj4.f136825h);
            sb.append(", menu=");
            LinkedList<C77935gl2> linkedList = kj4.f136826i;
            if (linkedList == null) {
                str2 = "LinkedList<JumpItem>{null}";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("LinkedList<JumpItem>{");
                Iterator<C77935gl2> it = linkedList.iterator();
                while (it.hasNext()) {
                    sb4.append(C75129p.m90110e(it.next()));
                    sb4.append(", ");
                }
                sb4.append("}");
                str2 = sb4.toString();
            }
            sb.append(str2);
            sb.append(", announcement=");
            sb.append(C75129p.m90110e(kj4.f136827j));
            sb.append(", homepage_ext='");
            sb.append(kj4.f136828n);
            sb.append('\'');
            sb.append('}');
            str = sb.toString();
        }
        objArr[0] = str;
        Log.m105925i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "updateView() mResponse:%s", objArr);
        if (this.f203891r == null) {
            this.f203881e.setVisibility(4);
            return;
        }
        this.f203881e.setVisibility(0);
        kj4 kj42 = this.f203891r;
        C77933g43 g432 = kj42.f136829o;
        if (g432 != null && g432.f227431d == 1) {
            this.f203890q.setBannerData(g432);
        } else if (kj42.f136827j != null) {
            this.f203882f.setVisibility(0);
            this.f203883g.setText(this.f203891r.f136827j.f227478d);
            this.f203882f.setOnClickListener(new MobileRemitNumberInputUI$$j(this));
        } else {
            this.f203882f.setVisibility(8);
        }
        this.f203884h.setText(this.f203891r.f136823f);
        this.f203885i.setText(this.f203891r.f136824g);
        int i2 = this.f203891r.f136825h;
        if (i2 == 0) {
            this.f203886j.getInfoIv().setVisibility(8);
        } else if (i2 == 1) {
            this.f203886j.getInfoIv().setVisibility(0);
        }
        if (this.f203891r.f136826i.size() > 0) {
            addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new MobileRemitNumberInputUI$$k(this));
        } else {
            removeOptionMenu(0);
        }
    }

    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bga;
    }

    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new MobileRemitNumberInputUI$$d(this));
        this.f203880d = (InputPanelFrameLayout) findViewById(C0966R.C0970id.iwf);
        ScrollView scrollView = (ScrollView) findViewById(C0966R.C0970id.j48);
        this.f203881e = (RelativeLayout) findViewById(C0966R.C0970id.gwy);
        this.f203882f = (LinearLayout) findViewById(C0966R.C0970id.gwx);
        this.f203883g = (TextView) findViewById(C0966R.C0970id.a7l);
        this.f203884h = (TextView) findViewById(C0966R.C0970id.gwz);
        this.f203885i = (TextView) findViewById(C0966R.C0970id.gwt);
        this.f203886j = (WalletFormView) findViewById(C0966R.C0970id.f358759gx0);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f203890q = wcPayBannerView;
        wcPayBannerView.mo105020a();
        TextView titleTv = this.f203886j.getTitleTv();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) titleTv.getLayoutParams();
        layoutParams.width = -2;
        titleTv.setLayoutParams(layoutParams);
        TenpaySecureEditText tenpaySecureEditText = (TenpaySecureEditText) this.f203886j.getContentEt();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) tenpaySecureEditText.getLayoutParams();
        layoutParams2.leftMargin = C76577a.m92151b(getContext(), 24);
        tenpaySecureEditText.setLayoutParams(layoutParams2);
        tenpaySecureEditText.setFocusable(true);
        WalletIconImageView infoIv = this.f203886j.getInfoIv();
        int color = getResources().getColor(C0966R.color.FG_2);
        infoIv.f212566u = C0966R.raw.icons_filled_close2;
        infoIv.f212567v = color;
        this.f203886j.getInfoIv().setIconContentDescription(getString(C0966R.string.hii));
        this.f203887n = (Button) findViewById(C0966R.C0970id.gwu);
        this.f203888o = findViewById(C0966R.C0970id.gww);
        this.f203889p = findViewById(C0966R.C0970id.agw);
        this.f203880d.setExternalListener(new MobileRemitNumberInputUI$$e(this));
        this.f203887n.setEnabled(false);
        this.f203887n.setOnClickListener(new MobileRemitNumberInputUI$$f(this));
        this.f203886j.getInfoIv().setOnClickListener(new MobileRemitNumberInputUI$$g(this));
        this.f203886j.mo105069a(new MobileRemitNumberInputUI$$h(this));
        this.f203886j.getContentEt().requestFocus();
    }

    public void onCreate(Bundle bundle) {
        C77935gl2 gl22;
        super.onCreate(bundle);
        this.f203894u = getIntent().getStringExtra("key_content");
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        initView();
        if (!Util.isNullOrNil(this.f203894u)) {
            this.f203886j.setText(this.f203894u);
            this.f203887n.setEnabled(true);
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_HOME_PAGE_INFO_STRING_SYNC, "");
        Object[] objArr = new Object[1];
        objArr[0] = Util.isNullOrNil(str) ? "null" : str;
        Log.m105919d("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "updateResponse() jsonString:%s", objArr);
        if (!Util.isNullOrNil(str)) {
            int i = C53181d.f148365u;
            kj4 kj4 = new kj4();
            try {
                JSONObject jSONObject = new JSONObject(str);
                kj4.f136821d = jSONObject.optInt("ret_code");
                kj4.f136822e = jSONObject.optString("ret_msg");
                kj4.f136823f = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                kj4.f136824g = jSONObject.optString("subtitle");
                kj4.f136825h = jSONObject.optInt("has_his_rcvr");
                JSONArray optJSONArray = jSONObject.optJSONArray("menu");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        kj4.f136826i.add(C75129p.m90106a(optJSONArray.getJSONObject(i2)));
                    }
                }
                try {
                    gl22 = C75129p.m90106a(new JSONObject(jSONObject.optString("announcement")));
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JumpItemUtil", "createFromJSONObject() Exception:%s", e.getMessage());
                    gl22 = null;
                }
                kj4.f136827j = gl22;
                kj4.f136828n = jSONObject.optString("homepage_ext");
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "createFromJson() Exception:%s", e2.getMessage());
                kj4 = null;
            }
            this.f203891r = kj4;
        }
        mo97206J7();
        boolean isNullOrNil = Util.isNullOrNil(str);
        Log.m105925i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "doNetSceneMobileRemitGetHomePage() isShowProgress:%s", Boolean.valueOf(isNullOrNil));
        this.f203892s = isNullOrNil;
        doSceneProgress(new C53181d(true), isNullOrNil);
        addSceneEndListener(2952);
        addSceneEndListener(2993);
        addSceneEndListener(1495);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2952);
        removeSceneEndListener(2993);
        removeSceneEndListener(1495);
    }

    public void onPause() {
        super.onPause();
        this.f203886j.getContentEt().clearFocus();
        hideVKB();
        this.f203880d.getInputPanelHelper().f220483j = false;
        this.f203893t = 0;
        mo97205I7(false);
    }

    public void onResume() {
        super.onResume();
        this.f203880d.postDelayed(new MobileRemitNumberInputUI$$i(this, new WeakReference(this.f203886j)), 500);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ArrayList arrayList;
        String str2;
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (i == 0 && i2 == 0) {
            kj4 kj4 = null;
            if (yVar instanceof C53181d) {
                kj4 kj42 = ((C53181d) yVar).f148366t;
                if (kj42 != null) {
                    kj4 = kj42;
                }
                this.f203891r = kj4;
                if (kj4 != null && kj4.f136821d == 0) {
                    mo97206J7();
                    C85801v1 i3 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_HOME_PAGE_INFO_STRING_SYNC;
                    kj4 kj43 = this.f203891r;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ret_code", kj43.f136821d);
                        jSONObject.put("ret_msg", kj43.f136822e);
                        jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, kj43.f136823f);
                        jSONObject.put("subtitle", kj43.f136824g);
                        jSONObject.put("has_his_rcvr", kj43.f136825h);
                        if (kj43.f136826i != null) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<C77935gl2> it = kj43.f136826i.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(C75129p.m90107b(it.next()));
                            }
                            jSONObject.put("menu", jSONArray);
                        }
                        jSONObject.put("announcement", kj43.f136827j);
                        jSONObject.put("homepage_ext", kj43.f136828n);
                        str2 = jSONObject.toString();
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "getJsonStrFromHomePageInfo() Exception: %s", e.getMessage());
                        str2 = "";
                    }
                    i3.mo119677K(aVar, str2);
                } else if (this.f203892s) {
                    AppCompatActivity context = getContext();
                    kj4 kj44 = this.f203891r;
                    C76912y0.makeText((Context) context, (CharSequence) (kj44 == null || Util.isNullOrNil(kj44.f136822e)) ? getString(C0966R.string.krp) : this.f203891r.f136822e, 0).show();
                }
            } else if (yVar instanceof NetSceneMobileRemitGetRecord) {
                ej4 ej4 = ((NetSceneMobileRemitGetRecord) yVar).f115982t;
                if (ej4 == null) {
                    ej4 = null;
                }
                if (ej4 == null || ej4.f132961d != 0) {
                    C76912y0.makeText((Context) getContext(), (CharSequence) (ej4 == null || Util.isNullOrNil(ej4.f132962e)) ? getString(C0966R.string.krp) : ej4.f132962e, 0).show();
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("key_homepage_ext", this.f203891r.f136828n);
                    intent.putExtra("key_finish", ej4.f132964g);
                    intent.putExtra("key_last_id", ej4.f132965h);
                    LinkedList<C77947ig2> linkedList = ej4.f132963f;
                    if (linkedList == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        Iterator<C77947ig2> it4 = linkedList.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(new NetSceneMobileRemitGetRecord.HisRcvrParcel(it4.next()));
                        }
                    }
                    intent.putExtra("key_history_record", arrayList);
                    C88144b.m109791i(getContext(), "remittance", ".mobile.ui.MobileRemitHistoryRecodUI", intent, (Bundle) null);
                    Log.m105925i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "TransferPhoneGetHisRcvrsResp finish:%s lastId:%s hisRecord.size:%s", Boolean.valueOf(ej4.f132964g), ej4.f132965h, Integer.valueOf(ej4.f132963f.size()));
                }
            } else if (yVar instanceof NetSceneMobileRemitGetRecvInfo) {
                NetSceneMobileRemitGetRecvInfo netSceneMobileRemitGetRecvInfo = (NetSceneMobileRemitGetRecvInfo) yVar;
                gj4 gj4 = netSceneMobileRemitGetRecvInfo.f115992v;
                if (gj4 == null) {
                    gj4 = null;
                }
                if (gj4 == null) {
                    Log.m105920e("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "NetSceneMobileRemitGetRecvInfo rcvrResp is null");
                    return true;
                }
                Log.m105925i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "NetSceneMobileRemitGetRecvInfo phone:%s ret_code:%s ret_msg:%s", netSceneMobileRemitGetRecvInfo.f115991u, Integer.valueOf(gj4.f227461d), gj4.f227462e);
                if (gj4.f227461d != 0) {
                    if (gj4.f227463f == 1) {
                        Log.m105928w("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "why here???");
                    }
                    C76879j.m92711E(getContext(), Util.isNullOrNil(gj4.f227462e) ? getString(C0966R.string.krp) : gj4.f227462e, "", getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
                } else {
                    if (gj4.f227464g != null) {
                        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "show remark or nickname change dialog!");
                        C75129p.m90109d(this, gj4.f227464g, null, new MobileRemitNumberInputUI$$l(this, gj4));
                    } else if (gj4.f227477w != null) {
                        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "show free oneself from dialog!");
                        C75129p.m90109d(this, gj4.f227477w, null, new MobileRemitNumberInputUI$$b(this, gj4));
                    } else {
                        C78843b.m95367a(getContext(), gj4);
                    }
                    return true;
                }
            }
            return false;
        } else if (yVar instanceof C53181d) {
            if (this.f203892s) {
                AppCompatActivity context2 = getContext();
                if (Util.isNullOrNil(str)) {
                    str = getString(C0966R.string.krp);
                }
                C76912y0.makeText((Context) context2, (CharSequence) str, 0).show();
            }
            return true;
        } else {
            if (!(yVar instanceof NetSceneMobileRemitGetRecord)) {
                boolean z = yVar instanceof NetSceneMobileRemitGetRecvInfo;
            }
            if (i2 == 0) {
                AppCompatActivity context3 = getContext();
                if (Util.isNullOrNil(str)) {
                    str = getString(C0966R.string.f361039gu2);
                }
                C76912y0.makeText((Context) context3, (CharSequence) str, 0).show();
            }
            return true;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(MobileRemitNumberInputUI$$m.class);
    }
}
