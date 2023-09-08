package com.tencent.p014mm.plugin.voip.p475ui;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z33.C112595h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/ui/RepairerVoipFaceBeautyUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI */
public final class RepairerVoipFaceBeautyUI extends MMSecDataActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f317859g = 0;

    /* renamed from: d */
    public final C13601g f317860d = C36568h.m40985a(C106413c.f317865d);

    /* renamed from: e */
    public final C13601g f317861e = C36568h.m40985a(new C106414d(this));

    /* renamed from: f */
    public final C13601g f317862f = C36568h.m40985a(new C106412b(this));

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$a */
    public static final class C106411a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipFaceBeautyUI f317863d;

        public C106411a(RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI) {
            this.f317863d = repairerVoipFaceBeautyUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f317863d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$b */
    public static final class C106412b extends C87413o implements C32224a<WxRecyclerAdapter<C30537a>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipFaceBeautyUI f317864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106412b(RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI) {
            super(0);
            this.f317864d = repairerVoipFaceBeautyUI;
        }

        public Object invoke() {
            RepairerVoipFaceBeautyUI$paramsAdapter$2$1 repairerVoipFaceBeautyUI$paramsAdapter$2$1 = new RepairerVoipFaceBeautyUI$paramsAdapter$2$1(this.f317864d);
            RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI = this.f317864d;
            int i = RepairerVoipFaceBeautyUI.f317859g;
            return new WxRecyclerAdapter(repairerVoipFaceBeautyUI$paramsAdapter$2$1, repairerVoipFaceBeautyUI.mo152904H7(), false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$c */
    public static final class C106413c extends C87413o implements C32224a<ArrayList<C30537a>> {

        /* renamed from: d */
        public static final C106413c f317865d = new C106413c();

        public C106413c() {
            super(0);
        }

        public Object invoke() {
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, ""));
                Iterator<String> keys = jSONObject.keys();
                C87412m.m108593f(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    C87412m.m108593f(next, "s");
                    try {
                        if (jSONObject.has(next)) {
                            i2 = jSONObject.getInt(next);
                            arrayList.add(new C30537a(next, i2));
                        }
                    } catch (Exception e) {
                        Log.printDebugStack("safeGetInt", "", e);
                    }
                    i2 = 0;
                    arrayList.add(new C30537a(next, i2));
                }
            } catch (Exception unused) {
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C30537a(ProviderConstants.API_COLNAME_FEATURE_VERSION, C112595h.m153922i()));
                XEffectConfig l = C112595h.m153925l();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("skinSmooth", l.f318443g);
                jSONObject2.put("faceMorph", l.f318445i);
                jSONObject2.put("skinBright", l.f318446j);
                jSONObject2.put("eyeBright", l.f318447n);
                jSONObject2.put("rosy", l.f318448o);
                jSONObject2.put("eyePouch", l.f318449p);
                jSONObject2.put("smileFolds", l.f318450q);
                jSONObject2.put("sharpen", l.f318451r);
                jSONObject2.put("teethBright", l.f318452s);
                jSONObject2.put("smallHead", l.f318453t);
                jSONObject2.put("cheekBone", l.f318454u);
                jSONObject2.put("lowerJawbone", l.f318455v);
                jSONObject2.put("wingOfNose", l.f318456w);
                jSONObject2.put("chinShort", l.f318457x);
                jSONObject2.put("chinLong", l.f318458y);
                jSONObject2.put("hairLineHigh", l.f318459z);
                jSONObject2.put("hairLineLow", l.f318431A);
                jSONObject2.put("bigEye", l.f318432B);
                jSONObject2.put("boySlim", l.f318433C);
                jSONObject2.put("girlSlim", l.f318434D);
                jSONObject2.put("mouthMorph", l.f318435E);
                jSONObject2.put("zhaiLian", l.f318436F);
                jSONObject2.put("contour", l.f318437G);
                jSONObject2.put("filterRate", l.f318438H);
                Iterator<String> keys2 = jSONObject2.keys();
                C87412m.m108593f(keys2, "jsonObject.keys()");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    C87412m.m108593f(next2, "s");
                    try {
                        if (jSONObject2.has(next2)) {
                            i = jSONObject2.getInt(next2);
                            arrayList.add(new C30537a(next2, i));
                        }
                    } catch (Exception e2) {
                        Log.printDebugStack("safeGetInt", "", e2);
                    }
                    i = 0;
                    arrayList.add(new C30537a(next2, i));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI$d */
    public static final class C106414d extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipFaceBeautyUI f317866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106414d(RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI) {
            super(0);
            this.f317866d = repairerVoipFaceBeautyUI;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f317866d.findViewById(C0966R.C0970id.mug);
        }
    }

    /* renamed from: H7 */
    public final ArrayList<C30537a> mo152904H7() {
        return (ArrayList) ((C36570n) this.f317860d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5h;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
        }
        if (!z && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_local_wechat_repair_entrance_flag_and, 0) == 0) {
            finish();
        }
        setBackBtn(new C106411a(this));
        setMMTitle("配置美颜参数");
        Object value = ((C36570n) this.f317861e).getValue();
        C87412m.m108593f(value, "<get-paramsRecycler>(...)");
        ((WxRecyclerView) value).setLayoutManager(new LinearLayoutManager(this));
        Object value2 = ((C36570n) this.f317861e).getValue();
        C87412m.m108593f(value2, "<get-paramsRecycler>(...)");
        ((WxRecyclerView) value2).setAdapter((WxRecyclerAdapter) ((C36570n) this.f317862f).getValue());
    }

    public void onDestroy() {
        super.onDestroy();
        JSONObject jSONObject = new JSONObject();
        for (C30537a aVar : mo152904H7()) {
            jSONObject.put(aVar.f82269d, aVar.f82270e);
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, jSONObject.toString());
    }
}
