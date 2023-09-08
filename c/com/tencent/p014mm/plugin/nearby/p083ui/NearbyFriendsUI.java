package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import cc0.C92411b;
import cc2.C54713e;
import cc2.C67351c;
import cc2.C67354f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LbsSayHiEvent;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.cache.MCacheItem;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import gc0.C20828a;
import h81.C32735h;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import lc3.C10485b;
import lj3.C46863b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p214om.C11502f;
import p629ny.C76979h;
import p702ts.C78085c;
import p749xh.C53349s0;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C51043r10;
import te3.C64319dn2;
import te3.C77921en2;
import te3.C78019ym2;
import te3.a94;
import uc3.C78146a;

@C86737h0
/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI */
public class NearbyFriendsUI extends MMActivity implements C11385n {

    /* renamed from: D */
    public static final /* synthetic */ int f201605D = 0;

    /* renamed from: A */
    public boolean f201606A;

    /* renamed from: B */
    public boolean f201607B = false;

    /* renamed from: C */
    public C92411b.C92412a f201608C = new C69882e();

    /* renamed from: d */
    public C89779i0 f201609d = null;

    /* renamed from: e */
    public C69894m f201610e;

    /* renamed from: f */
    public ListView f201611f;

    /* renamed from: g */
    public C54713e f201612g;

    /* renamed from: h */
    public C54713e f201613h;

    /* renamed from: i */
    public C67354f f201614i;

    /* renamed from: j */
    public List<C78019ym2> f201615j = new LinkedList();

    /* renamed from: n */
    public Map<String, C69892k> f201616n = new HashMap();

    /* renamed from: o */
    public boolean f201617o = false;

    /* renamed from: p */
    public int f201618p = 1;

    /* renamed from: q */
    public ViewGroup f201619q;

    /* renamed from: r */
    public View f201620r;

    /* renamed from: s */
    public boolean f201621s = false;

    /* renamed from: t */
    public int f201622t;

    /* renamed from: u */
    public boolean f201623u = false;

    /* renamed from: v */
    public C92411b f201624v;

    /* renamed from: w */
    public boolean f201625w = false;

    /* renamed from: x */
    public View f201626x = null;

    /* renamed from: y */
    public C69893l f201627y;

    /* renamed from: z */
    public IListener f201628z = new IListener<LbsSayHiEvent>(C40008f.f107254d) {
        {
            this.__eventId = -772738789;
        }

        public boolean callback(IEvent iEvent) {
            if (((LbsSayHiEvent) iEvent) == null) {
                return false;
            }
            MMHandlerThread.postToMainThread(new C69930f(this));
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$a */
    public class C69878a implements Runnable {
        public C69878a(NearbyFriendsUI nearbyFriendsUI) {
        }

        public void run() {
            C85405m.m105412b(11);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$b */
    public class C69879b implements DialogInterface.OnClickListener {
        public C69879b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107535s().mo121142i().mo119676J(4104, Boolean.TRUE);
            NearbyFriendsUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$c */
    public class C69880c implements DialogInterface.OnClickListener {
        public C69880c(NearbyFriendsUI nearbyFriendsUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$d */
    public class C69881d implements DialogInterface.OnCancelListener {
        public C69881d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            NearbyFriendsUI.this.f201607B = true;
            C85405m.m105415e(11);
            if (NearbyFriendsUI.this.f201612g != null) {
                C86709a0.m107524d().mo123458d(NearbyFriendsUI.this.f201612g);
            }
            Log.m105924i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in loading");
            NearbyFriendsUI nearbyFriendsUI = NearbyFriendsUI.this;
            if (!nearbyFriendsUI.f201623u) {
                nearbyFriendsUI.finish();
                Log.m105924i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in first loading");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$e */
    public class C69882e implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$e$a */
        public class C69883a implements DialogInterface.OnClickListener {
            public C69883a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(NearbyFriendsUI.this);
            }
        }

        public C69882e() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            NearbyFriendsUI nearbyFriendsUI = NearbyFriendsUI.this;
            if (nearbyFriendsUI.f201625w) {
                return false;
            }
            nearbyFriendsUI.f201625w = true;
            if (nearbyFriendsUI.f201607B) {
                C89779i0 i0Var = nearbyFriendsUI.f201609d;
                if (i0Var != null) {
                    i0Var.dismiss();
                    NearbyFriendsUI.this.f201609d = null;
                }
                C85405m.m105415e(11);
                return false;
            }
            if (z) {
                C89779i0 i0Var2 = nearbyFriendsUI.f201609d;
                if (i0Var2 != null) {
                    i0Var2.setMessage(nearbyFriendsUI.getString(C0966R.string.h5j));
                }
                NearbyFriendsUI nearbyFriendsUI2 = NearbyFriendsUI.this;
                int i2 = (int) d2;
                float f3 = f;
                float f4 = f2;
                nearbyFriendsUI2.f201627y = new C69893l(nearbyFriendsUI2, f2, f, i2);
                nearbyFriendsUI2.f201612g = new C54713e(nearbyFriendsUI2.f201618p, f, f2, i2, i, "", "");
                C86709a0.m107524d().mo123460f(NearbyFriendsUI.this.f201612g);
            } else {
                C85405m.m105415e(11);
                C89779i0 i0Var3 = NearbyFriendsUI.this.f201609d;
                if (i0Var3 != null) {
                    i0Var3.dismiss();
                    NearbyFriendsUI.this.f201609d = null;
                }
                View findViewById = NearbyFriendsUI.this.findViewById(C0966R.C0970id.h_y);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$3", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$3", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NearbyFriendsUI.this.f201611f.setVisibility(8);
                NearbyFriendsUI nearbyFriendsUI3 = NearbyFriendsUI.this;
                nearbyFriendsUI3.f201623u = true;
                if (!nearbyFriendsUI3.f201606A && !LocationUtil.isGpsEnable()) {
                    NearbyFriendsUI nearbyFriendsUI4 = NearbyFriendsUI.this;
                    nearbyFriendsUI4.f201606A = true;
                    C76879j.m92709C(nearbyFriendsUI4, nearbyFriendsUI4.getString(C0966R.string.fez), NearbyFriendsUI.this.getString(C0966R.string.a3h), NearbyFriendsUI.this.getString(C0966R.string.fyd), NearbyFriendsUI.this.getString(C0966R.string.f7926wf), false, new C69883a(), (DialogInterface.OnClickListener) null);
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$f */
    public class C69884f implements AdapterView.OnItemClickListener {
        public C69884f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Class cls = C11502f.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            int i2 = NearbyFriendsUI.this.f201622t <= 0 ? i : i - 1;
            if (C78146a.m94354c() && NearbyFriendsUI.this.f201626x != null) {
                i2--;
            }
            NearbyFriendsUI nearbyFriendsUI = NearbyFriendsUI.this;
            if (nearbyFriendsUI.f201621s) {
                i2--;
            }
            if (i2 < 0 || i2 >= ((LinkedList) nearbyFriendsUI.f201615j).size()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C78019ym2 ym22 = (C78019ym2) ((LinkedList) NearbyFriendsUI.this.f201615j).get(i2);
            if (ym22.f228628j == 10000) {
                C69892k kVar = (C69892k) ((HashMap) NearbyFriendsUI.this.f201616n).get(ym22.f228622d);
                kVar.f201652l |= 1;
                int i3 = kVar.f201648h;
                if (i3 == 1) {
                    AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                    appBrandStatObject.f245533f = 1134;
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(NearbyFriendsUI.this, kVar.f201649i, "", 0, 0, "", appBrandStatObject);
                } else if (i3 == 2) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", kVar.f201649i);
                    intent.putExtra("geta8key_scene", 25);
                    intent.putExtra("stastic_scene", 12);
                    C88144b.m109791i(NearbyFriendsUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            String str = ym22.f228622d;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            String str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            String str3 = "onItemClick";
            if (z1Var.mo62927s3()) {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", str);
                intent2.putExtra("Contact_Scene", 18);
                intent2.putExtra("Sns_from_Scene", 18);
                intent2.putExtra("lbs_ticket", ym22.f228619C);
                intent2.putExtra("Contact_IsLbsGotoChatting", true);
                if (str != null && str.length() > 0) {
                    if (z1Var.mo62916m3()) {
                        C115669n.INSTANCE.kvStat(10298, str + "," + 18);
                    }
                    SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                    SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                    aVar.f9503a = intent2;
                    aVar.f9504b = str;
                    setLocalQQMobileEvent.publish();
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                    intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent2, NearbyFriendsUI.this);
                }
            } else {
                Intent intent3 = new Intent();
                intent3.putExtra("Contact_User", ym22.f228622d);
                intent3.putExtra("Contact_Alias", ym22.f228633r);
                intent3.putExtra("Contact_Nick", ym22.f228623e);
                intent3.putExtra("Contact_Distance", ym22.f228627i);
                intent3.putExtra("Contact_Signature", ym22.f228626h);
                intent3.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(ym22.f228639x, ym22.f228624f, ym22.f228625g));
                intent3.putExtra("Contact_Sex", ym22.f228628j);
                intent3.putExtra("Contact_IsLBSFriend", true);
                intent3.putExtra("Contact_Scene", 18);
                intent3.putExtra("Contact_VUser_Info", ym22.f228631p);
                intent3.putExtra("Contact_VUser_Info_Flag", ym22.f228630o);
                intent3.putExtra("Contact_KWeibo_flag", ym22.f228636u);
                intent3.putExtra("Contact_KWeibo", ym22.f228634s);
                intent3.putExtra("Contact_KWeiboNick", ym22.f228635t);
                intent3.putExtra("Contact_KSnsIFlag", ym22.f228638w.f130392d);
                intent3.putExtra("Contact_KSnsBgId", ym22.f228638w.f130394f);
                intent3.putExtra("Contact_KSnsBgUrl", ym22.f228638w.f130393e);
                intent3.putExtra("lbs_ticket", ym22.f228619C);
                intent3.putExtra("Contact_IsLbsGotoChatting", true);
                if (ym22.f228617A != null) {
                    C53349s0 s0Var = new C53349s0();
                    s0Var.field_brandList = ym22.f228617A;
                    C51043r10 r102 = ym22.f228618B;
                    s0Var.field_brandFlag = r102.f140656d;
                    s0Var.field_brandIconURL = r102.f140659g;
                    s0Var.field_extInfo = r102.f140657e;
                    s0Var.field_brandInfo = r102.f140658f;
                    intent3.putExtra("KBrandInfo_item", new MCacheItem((IAutoDBItem) s0Var));
                }
                intent3.putExtra("Sns_from_Scene", 18);
                intent3.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent3, NearbyFriendsUI.this);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$5", "android/widget/AdapterView$OnItemClickListener", str3, str2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$g */
    public class C69885g implements View.OnTouchListener {
        public C69885g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C46863b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C69894m mVar = NearbyFriendsUI.this.f201610e;
            if (!(mVar == null || (bVar = mVar.f201658e) == null)) {
                bVar.mo72073c(motionEvent);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$h */
    public class C69886h implements MenuItem.OnMenuItemClickListener {
        public C69886h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NearbyFriendsUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$i */
    public class C69887i implements View.OnClickListener {
        public C69887i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = NearbyFriendsUI.this.f201611f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$8", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$8", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$j */
    public class C69888j implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$j$a */
        public class C69889a implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$j$a$a */
            public class C69890a implements DialogInterface.OnCancelListener {
                public C69890a() {
                }

                public void onCancel(DialogInterface dialogInterface) {
                    C86709a0.m107524d().mo123458d(NearbyFriendsUI.this.f201613h);
                }
            }

            public C69889a() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (i == 0) {
                    NearbyFriendsUI nearbyFriendsUI = NearbyFriendsUI.this;
                    nearbyFriendsUI.f201618p = 4;
                    nearbyFriendsUI.f201617o = false;
                    C86709a0.m107535s().mo121142i().mo119676J(16386, Integer.valueOf(NearbyFriendsUI.this.f201618p));
                    NearbyFriendsUI.this.mo96194I7();
                } else if (i == 1) {
                    NearbyFriendsUI nearbyFriendsUI2 = NearbyFriendsUI.this;
                    nearbyFriendsUI2.f201618p = 3;
                    nearbyFriendsUI2.f201617o = false;
                    C86709a0.m107535s().mo121142i().mo119676J(16386, Integer.valueOf(NearbyFriendsUI.this.f201618p));
                    NearbyFriendsUI.this.mo96194I7();
                } else if (i == 2) {
                    NearbyFriendsUI nearbyFriendsUI3 = NearbyFriendsUI.this;
                    nearbyFriendsUI3.f201618p = 1;
                    nearbyFriendsUI3.f201617o = false;
                    C86709a0.m107535s().mo121142i().mo119676J(16386, Integer.valueOf(NearbyFriendsUI.this.f201618p));
                    NearbyFriendsUI.this.mo96194I7();
                } else if (i == 3) {
                    Intent intent = new Intent(NearbyFriendsUI.this, NearbySayHiListUI.class);
                    intent.putExtra("k_say_hi_type", 2);
                    NearbyFriendsUI.this.startActivityForResult(intent, 2009);
                } else if (i == 4) {
                    NearbyFriendsUI.this.f201613h = new C54713e(2, 0.0f, 0.0f, 0, 0, "", "");
                    C86709a0.m107524d().mo123460f(NearbyFriendsUI.this.f201613h);
                    NearbyFriendsUI nearbyFriendsUI4 = NearbyFriendsUI.this;
                    nearbyFriendsUI4.f201609d = C76879j.m92723Q(nearbyFriendsUI4.getContext(), NearbyFriendsUI.this.getString(C0966R.string.a3h), NearbyFriendsUI.this.getString(C0966R.string.h5h), true, true, new C69890a());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$j$b */
        public class C69891b implements C11182m0 {
            public C69891b(C69888j jVar) {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107125a(-1, C0966R.string.h5v);
                e0Var.mo107125a(-1, C0966R.string.h5u);
                e0Var.mo107125a(-1, C0966R.string.h5t);
                e0Var.mo107125a(-1, C0966R.string.iaw);
                e0Var.mo107125a(-1, C0966R.string.h5d);
            }
        }

        public C69888j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) NearbyFriendsUI.this, 1, false);
            nVar.f225782p = new C69889a();
            nVar.f225771i = new C69891b(this);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$k */
    public static class C69892k {

        /* renamed from: a */
        public String f201641a;

        /* renamed from: b */
        public int f201642b;

        /* renamed from: c */
        public int f201643c;

        /* renamed from: d */
        public int f201644d;

        /* renamed from: e */
        public String f201645e;

        /* renamed from: f */
        public String f201646f;

        /* renamed from: g */
        public String f201647g;

        /* renamed from: h */
        public int f201648h;

        /* renamed from: i */
        public String f201649i;

        /* renamed from: j */
        public int f201650j;

        /* renamed from: k */
        public int f201651k;

        /* renamed from: l */
        public int f201652l = -1;

        /* renamed from: m */
        public boolean f201653m = false;
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$l */
    public class C69893l {

        /* renamed from: a */
        public float f201654a;

        /* renamed from: b */
        public float f201655b;

        /* renamed from: c */
        public int f201656c;

        public C69893l(NearbyFriendsUI nearbyFriendsUI, float f, float f2, int i) {
            this.f201654a = f;
            this.f201655b = f2;
            this.f201656c = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$m */
    public class C69894m extends BaseAdapter {

        /* renamed from: d */
        public final Context f201657d;

        /* renamed from: e */
        public C46863b f201658e = new C46863b(15, new C69895a(this));

        /* renamed from: f */
        public C46863b.C46867d f201659f = null;

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$m$a */
        public class C69895a implements C46863b.C46866c {
            public C69895a(C69894m mVar) {
            }

            /* renamed from: a */
            public Bitmap mo63515a(String str) {
                return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
            }
        }

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$m$b */
        public class C69896b implements C46863b.C46867d {
            public C69896b() {
            }

            /* renamed from: a */
            public int mo63517a() {
                return C69894m.this.getCount();
            }

            /* renamed from: b */
            public String mo63518b(int i) {
                if (i < 0 || i >= C69894m.this.getCount()) {
                    Log.m105920e("MicroMsg.NearbyFriend", "pos is invalid");
                    return null;
                }
                C78019ym2 ym22 = (C78019ym2) ((LinkedList) NearbyFriendsUI.this.f201615j).get(i);
                if (ym22 == null) {
                    return null;
                }
                return ym22.f228622d;
            }
        }

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$m$c */
        public class C69897c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C78019ym2 f201662d;

            public C69897c(C78019ym2 ym22) {
                this.f201662d = ym22;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$NearbyFriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C69892k kVar = (C69892k) ((HashMap) NearbyFriendsUI.this.f201616n).get(this.f201662d.f228622d);
                if (kVar != null) {
                    kVar.f201650j++;
                    kVar.f201653m = true;
                    kVar.f201652l |= 2;
                }
                NearbyFriendsUI.this.mo96195J7();
                C69894m.this.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$NearbyFriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C69894m(Context context) {
            this.f201657d = context;
        }

        public int getCount() {
            return NearbyFriendsUI.this.f201615j.size();
        }

        public Object getItem(int i) {
            return (C78019ym2) ((LinkedList) NearbyFriendsUI.this.f201615j).get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C69898n nVar;
            View view2;
            Class cls = C75700k0.class;
            Class cls2 = C76979h.class;
            if (this.f201659f == null) {
                this.f201659f = new C69896b();
            }
            C46863b bVar = this.f201658e;
            if (bVar != null) {
                bVar.mo72072b(i, this.f201659f);
            }
            if (view == null) {
                nVar = new C69898n();
                view2 = View.inflate(this.f201657d, C0966R.C0971layout.f359911bk2, (ViewGroup) null);
                nVar.f201664a = (TextView) view2.findViewById(C0966R.C0970id.f358830ha0);
                nVar.f201666c = (TextView) view2.findViewById(C0966R.C0970id.f358833ha3);
                nVar.f201665b = (TextView) view2.findViewById(C0966R.C0970id.h_v);
                nVar.f201667d = (ImageView) view2.findViewById(C0966R.C0970id.h_u);
                nVar.f201668e = (TextView) view2.findViewById(C0966R.C0970id.h_x);
                nVar.f201669f = (ImageView) view2.findViewById(C0966R.C0970id.ha5);
                nVar.f201670g = (ImageView) view2.findViewById(C0966R.C0970id.ha4);
                nVar.f201672i = (ImageView) view2.findViewById(C0966R.C0970id.h_r);
                nVar.f201673j = (ImageView) view2.findViewById(C0966R.C0970id.h_s);
                nVar.f201674k = (ImageView) view2.findViewById(C0966R.C0970id.h_t);
                nVar.f201675l = (ImageView) view2.findViewById(C0966R.C0970id.bec);
                ViewGroup.LayoutParams layoutParams = nVar.f201670g.getLayoutParams();
                layoutParams.height = C76577a.m92157h(this.f201657d, C0966R.dimen.f3926j6);
                layoutParams.width = C76577a.m92157h(this.f201657d, C0966R.dimen.f3926j6);
                nVar.f201670g.setLayoutParams(layoutParams);
                nVar.f201671h = (ImageView) view2.findViewById(C0966R.C0970id.f358832ha2);
                view2.setTag(nVar);
            } else {
                view2 = view;
                nVar = (C69898n) view.getTag();
            }
            C78019ym2 ym22 = (C78019ym2) ((LinkedList) NearbyFriendsUI.this.f201615j).get(i);
            nVar.f201664a.setText(((C76979h) C86312j.m106911c(cls2)).yp0(this.f201657d, ym22.f228623e, nVar.f201664a.getTextSize()));
            if (NearbyFriendsUI.this.f201618p == 1) {
                int i2 = ym22.f228628j;
                if (i2 == 1) {
                    nVar.f201671h.setVisibility(0);
                    nVar.f201671h.setImageResource(C0966R.raw.ic_sex_male);
                    nVar.f201671h.setContentDescription(this.f201657d.getString(C0966R.string.gms));
                } else if (i2 != 2) {
                    nVar.f201671h.setVisibility(8);
                } else {
                    nVar.f201671h.setVisibility(0);
                    nVar.f201671h.setImageResource(C0966R.raw.ic_sex_female);
                    nVar.f201671h.setContentDescription(this.f201657d.getString(C0966R.string.csp));
                }
            } else {
                nVar.f201671h.setVisibility(8);
            }
            if (ym22.f228630o == 0) {
                nVar.f201669f.setVisibility(8);
                nVar.f201665b.setText(ym22.f228627i);
                nVar.f201672i.setVisibility(8);
                nVar.f201673j.setVisibility(8);
                nVar.f201674k.setVisibility(8);
                nVar.f201675l.setVisibility(8);
                if (ym22 instanceof C67351c) {
                    LinkedList<String> linkedList = ((C67351c) ym22).f193207F;
                    if (linkedList != null && linkedList.size() == 1) {
                        nVar.f201672i.setVisibility(0);
                        NearbyFriendsUI.m82335H7(NearbyFriendsUI.this, nVar.f201672i, linkedList.get(0));
                    } else if (linkedList != null && linkedList.size() == 2) {
                        nVar.f201672i.setVisibility(0);
                        nVar.f201673j.setVisibility(0);
                        NearbyFriendsUI.m82335H7(NearbyFriendsUI.this, nVar.f201672i, linkedList.get(0));
                        NearbyFriendsUI.m82335H7(NearbyFriendsUI.this, nVar.f201673j, linkedList.get(1));
                    } else if (linkedList != null && linkedList.size() >= 3) {
                        nVar.f201672i.setVisibility(0);
                        nVar.f201673j.setVisibility(0);
                        nVar.f201674k.setVisibility(0);
                        NearbyFriendsUI.m82335H7(NearbyFriendsUI.this, nVar.f201672i, linkedList.get(0));
                        NearbyFriendsUI.m82335H7(NearbyFriendsUI.this, nVar.f201673j, linkedList.get(1));
                        NearbyFriendsUI.m82335H7(NearbyFriendsUI.this, nVar.f201674k, linkedList.get(2));
                    }
                    C69892k kVar = (C69892k) ((HashMap) NearbyFriendsUI.this.f201616n).get(ym22.f228622d);
                    if (kVar != null) {
                        int i3 = kVar.f201652l;
                        if (i3 == -1) {
                            i3 = 0;
                        }
                        kVar.f201652l = i3;
                        if (kVar.f201643c > 0) {
                            nVar.f201675l.setVisibility(0);
                        }
                    }
                    nVar.f201675l.setOnClickListener(new C69897c(ym22));
                }
                String str = ym22.f228626h;
                if (str == null || str.trim().equals("")) {
                    nVar.f201666c.setVisibility(8);
                } else {
                    nVar.f201666c.setVisibility(0);
                    nVar.f201666c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(this.f201657d, ym22.f228626h, nVar.f201666c.getTextSize()));
                }
                a94 a94 = ym22.f228638w;
                if (a94 == null || (a94.f130392d & 1) <= 0) {
                    nVar.f201670g.setVisibility(8);
                } else {
                    nVar.f201670g.setVisibility(0);
                }
                if (ym22.f228628j == 10000) {
                    nVar.f201667d.setImageBitmap((Bitmap) null);
                    C20937c.C20939b bVar2 = new C20937c.C20939b();
                    bVar2.f59351g = C7970a.m8127a();
                    bVar2.f59346b = true;
                    bVar2.f59363s = true;
                    C20828a.m22825b().mo32519h(ym22.f228641z, nVar.f201667d, bVar2.mo32666a());
                    if (Util.isNullOrNil(ym22.f228633r)) {
                        nVar.f201668e.setVisibility(8);
                    } else {
                        nVar.f201668e.setText(ym22.f228633r);
                        nVar.f201668e.setVisibility(0);
                    }
                } else {
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(nVar.f201667d, ym22.f228622d);
                    if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69724s3(ym22.f228622d)) {
                        nVar.f201668e.setVisibility(0);
                        if (C72996z1.m85810M4(ym22.f228630o)) {
                            nVar.f201668e.setText(NearbyFriendsUI.this.getString(C0966R.string.h5l));
                        } else {
                            C72996z1 N2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(ym22.f228622d);
                            if (N2 != null) {
                                nVar.f201664a.setText(((C76979h) C86312j.m106911c(cls2)).yp0(this.f201657d, Util.isNullOrNil(N2.mo62898f()) ? ym22.f228623e : N2.mo62898f(), nVar.f201664a.getTextSize()));
                            }
                            nVar.f201668e.setText(NearbyFriendsUI.this.getString(C0966R.string.h5q));
                        }
                    } else {
                        nVar.f201668e.setVisibility(8);
                    }
                }
                return view2;
            }
            nVar.f201669f.setVisibility(0);
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$n */
    public static class C69898n {

        /* renamed from: a */
        public TextView f201664a;

        /* renamed from: b */
        public TextView f201665b;

        /* renamed from: c */
        public TextView f201666c;

        /* renamed from: d */
        public ImageView f201667d;

        /* renamed from: e */
        public TextView f201668e;

        /* renamed from: f */
        public ImageView f201669f;

        /* renamed from: g */
        public ImageView f201670g;

        /* renamed from: h */
        public ImageView f201671h;

        /* renamed from: i */
        public ImageView f201672i;

        /* renamed from: j */
        public ImageView f201673j;

        /* renamed from: k */
        public ImageView f201674k;

        /* renamed from: l */
        public ImageView f201675l;
    }

    /* renamed from: H7 */
    public static void m82335H7(NearbyFriendsUI nearbyFriendsUI, ImageView imageView, String str) {
        nearbyFriendsUI.getClass();
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.NearbyFriend", "setImgBmp url is empty");
            return;
        }
        imageView.setImageBitmap((Bitmap) null);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C7970a.m8127a();
        bVar.f59346b = true;
        bVar.f59363s = true;
        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
    }

    /* renamed from: I7 */
    public final void mo96194I7() {
        this.f201625w = false;
        this.f201609d = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.h5s), true, true, new C69881d());
        this.f201607B = false;
        C92411b bVar = this.f201624v;
        if (bVar != null) {
            bVar.mo126409c(this.f201608C, true, false);
            C5139t.m5183e(22, 10);
        }
    }

    /* renamed from: J7 */
    public final void mo96195J7() {
        int i;
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= ((LinkedList) this.f201615j).size()) {
                break;
            }
            if (((C78019ym2) ((LinkedList) this.f201615j).get(i3)).f228628j != 10000) {
                z = false;
            }
            if (!z) {
                linkedList.add((C78019ym2) ((LinkedList) this.f201615j).get(i3));
            }
            i3++;
        }
        ((LinkedList) this.f201615j).clear();
        this.f201615j = linkedList;
        Log.m105924i("MicroMsg.NearbyFriend", "insertPoiItemList()");
        boolean z2 = !this.f201615j.isEmpty();
        for (String str : ((HashMap) this.f201616n).keySet()) {
            if (z2) {
                C69892k kVar = (C69892k) ((HashMap) this.f201616n).get(str);
                if (!kVar.f201653m && (((i = kVar.f201643c) < 1 || kVar.f201650j < i) && kVar.f201651k < kVar.f201644d)) {
                    List<C78019ym2> list = this.f201615j;
                    int i4 = kVar.f201642b;
                    int size = (i4 < 0 || i4 > ((LinkedList) list).size()) ? ((LinkedList) this.f201615j).size() : kVar.f201642b + i2;
                    String str2 = kVar.f201641a;
                    String str3 = kVar.f201647g;
                    String str4 = kVar.f201645e;
                    String str5 = kVar.f201646f;
                    String str6 = kVar.f201649i;
                    C67351c cVar = new C67351c();
                    cVar.f228628j = 10000;
                    cVar.f228622d = str2;
                    cVar.f228641z = str3;
                    cVar.f228627i = str5;
                    cVar.f228623e = str4;
                    cVar.f228624f = str6;
                    ((LinkedList) list).add(size, cVar);
                    i2++;
                }
            }
        }
    }

    /* renamed from: K7 */
    public final void mo96196K7() {
        if (C78146a.m94354c()) {
            View view = this.f201626x;
            View view2 = null;
            if (view != null) {
                this.f201611f.removeHeaderView(view);
                this.f201626x = null;
            }
            Class cls = C75700k0.class;
            View inflate = View.inflate(this, C0966R.C0971layout.bk4, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.j0x);
            C86709a0.m107523b().mo121108c();
            int kD = ((C72957c4) ((C75700k0) C86709a0.m107533q(cls)).mo96099XB()).mo100937kD();
            if (kD == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = inflate;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = inflate;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(getResources().getQuantityString(C0966R.plurals.f7246a3, kD, new Object[]{Integer.valueOf(kD)}));
                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.gpl);
                C72956b4 bD = ((C72957c4) ((C75700k0) C86709a0.m107533q(cls)).mo96099XB()).mo100935bD();
                if (bD != null) {
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, bD.field_sayhiuser);
                }
                inflate.setOnClickListener(new C69933i(this));
                view2 = inflate;
            }
            this.f201626x = view2;
            if (view2 != null) {
                this.f201611f.addHeaderView(view2);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359909bk0;
    }

    public void initView() {
        this.f201611f = (ListView) findViewById(C0966R.C0970id.h_z);
        this.f201610e = new C69894m(this);
        ListView listView = this.f201611f;
        if (this.f201619q == null) {
            LinearLayout linearLayout = new LinearLayout(this);
            this.f201619q = linearLayout;
            linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            ((LinearLayout) this.f201619q).setGravity(17);
        }
        this.f201621s = true;
        listView.addHeaderView(this.f201619q);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("LBSShowBindPhone");
        if (c != null && c.length() > 0) {
            try {
                this.f201622t = Integer.valueOf(c).intValue();
            } catch (Exception unused) {
                this.f201622t = 0;
            }
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (str != null && str.length() > 0) {
            this.f201622t = 0;
        }
        if (this.f201622t > 0) {
            this.f201611f.addHeaderView(new BindMobileOrQQHeaderView(this));
        }
        this.f201611f.setAdapter(this.f201610e);
        this.f201611f.setOnItemClickListener(new C69884f());
        this.f201611f.setOnTouchListener(new C69885g());
        setBackBtn(new C69886h());
        setToTop(new C69887i());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C69888j());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105919d("MicroMsg.NearbyFriend", "onActivityResult, requestCode %s, resultCode %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1) {
            if (i == 2009 && i2 == -1) {
                finish();
            }
        } else if (i2 == -1) {
            this.f201617o = false;
            mo96194I7();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        C85405m.m105411a(11);
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f361088h63);
        C86709a0.m107524d().mo123455a(148, this);
        C86709a0.m107524d().mo123455a(376, this);
        C86709a0.m107524d().mo123455a(1087, this);
        this.f201624v = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        initView();
        getResources().getString(C0966R.string.h5v);
        getResources().getString(C0966R.string.h5u);
        getResources().getString(C0966R.string.h5t);
        getResources().getString(C0966R.string.iaw);
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(16386, (Object) null), 1);
        this.f201618p = nullAs;
        if (nullAs == 3) {
            setTitleLogo(0, C0966R.raw.ic_sex_male);
        } else if (nullAs == 4) {
            setTitleLogo(0, C0966R.raw.ic_sex_female);
        } else {
            setTitleLogo(0, 0);
            this.f201618p = 1;
        }
        mo96194I7();
        if (LocaleUtil.isSimplifiedChineseAppLang()) {
            String str = "";
            Map<String, String> parseXml = XmlParser.parseXml(((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_nearby_ad, str), "lbsads", (String) null);
            if (parseXml != null && (i = Util.getInt(parseXml.get(".lbsads.$count"), 0)) > 0) {
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".lbsads.lbsad");
                    sb.append(i2 == 0 ? str : Integer.valueOf(i2));
                    String sb4 = sb.toString();
                    C69892k kVar = new C69892k();
                    kVar.f201641a = parseXml.get(sb4 + ".$id");
                    kVar.f201642b = Util.getInt(parseXml.get(sb4 + ".$pos"), 0);
                    kVar.f201643c = Util.getInt(parseXml.get(sb4 + ".$close_times"), 0);
                    kVar.f201644d = Util.getInt(parseXml.get(sb4 + ".$show_times"), Integer.MAX_VALUE);
                    kVar.f201645e = parseXml.get(sb4 + ".name");
                    kVar.f201646f = parseXml.get(sb4 + ".desc");
                    kVar.f201647g = parseXml.get(sb4 + ".icon");
                    kVar.f201648h = Util.getInt(parseXml.get(sb4 + ".jump.$type"), 0);
                    kVar.f201649i = parseXml.get(sb4 + ".jump");
                    ((HashMap) this.f201616n).put(kVar.f201641a, kVar);
                    i2++;
                }
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NEAR_BY_AD_STRING_SYNC, (Object) null);
                if (f != null) {
                    str = (String) f;
                }
                for (String split : str.split("\\|")) {
                    String[] split2 = split.split(XVFSFile.PATH_SEPARATOR);
                    if (split2.length == 3) {
                        C69892k kVar2 = (C69892k) ((HashMap) this.f201616n).get(split2[0]);
                        if (kVar2 != null) {
                            kVar2.f201650j = Util.getInt(split2[1], 0);
                            kVar2.f201651k = Util.getInt(split2[2], 0);
                        }
                    }
                }
            }
        }
    }

    public void onDestroy() {
        C46863b bVar;
        C85405m.m105415e(11);
        C86709a0.m107524d().mo123470p(148, this);
        C86709a0.m107524d().mo123470p(376, this);
        C86709a0.m107524d().mo123470p(1087, this);
        C89779i0 i0Var = this.f201609d;
        if (i0Var != null && i0Var.isShowing()) {
            this.f201609d.dismiss();
        }
        C92411b bVar2 = this.f201624v;
        if (bVar2 != null) {
            bVar2.mo126408b(this.f201608C);
        }
        ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93574a();
        C69894m mVar = this.f201610e;
        if (!(mVar == null || (bVar = mVar.f201658e) == null)) {
            bVar.mo72071a();
            mVar.f201658e = null;
        }
        if (((LinkedList) this.f201615j).size() > 0) {
            String str = "";
            for (C69892k kVar : ((HashMap) this.f201616n).values()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("|");
                sb.append(kVar.f201641a);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(kVar.f201650j);
                sb.append(XVFSFile.PATH_SEPARATOR);
                int i = kVar.f201651k + 1;
                kVar.f201651k = i;
                sb.append(i);
                str = sb.toString();
                C115669n.INSTANCE.mo160131h(17431, kVar.f201641a, Integer.valueOf(kVar.f201652l + 1));
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEAR_BY_AD_STRING_SYNC, str);
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C92411b bVar = this.f201624v;
        if (bVar != null) {
            bVar.mo126408b(this.f201608C);
        }
        this.f201628z.dead();
    }

    public void onResume() {
        super.onResume();
        C92411b bVar = this.f201624v;
        if (bVar != null) {
            bVar.mo126409c(this.f201608C, true, false);
            C5139t.m5183e(22, 10);
        }
        mo96196K7();
        this.f201610e.notifyDataSetChanged();
        C86709a0.m107523b().mo121108c();
        if (((C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB()).mo100937kD() == 0) {
            this.f201611f.removeHeaderView((View) null);
        }
        this.f201628z.alive();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        String str3;
        int i3 = i2;
        Class cls = C11502f.class;
        Class cls2 = C75700k0.class;
        C89779i0 i0Var = this.f201609d;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f201609d = null;
        }
        if (yVar.getType() == 148) {
            C89779i0 i0Var2 = this.f201609d;
            if (i0Var2 != null) {
                i0Var2.dismiss();
                this.f201609d = null;
            }
            C54713e eVar = (C54713e) yVar;
            int f = eVar.mo75607f();
            if (this.f201612g != null || (f != 1 && f != 3 && f != 4)) {
                if ((f == 1 || f == 3 || f == 4) && this.f201617o) {
                    Log.m105927v("MicroMsg.NearbyFriend", "onSceneEnd data already requested, code=%d", Integer.valueOf(f));
                } else if (this.f201613h != null || f != 2) {
                    Log.m105925i("MicroMsg.NearbyFriend", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", Integer.valueOf(i), Integer.valueOf(i2), str);
                    if (yVar.getType() == 148) {
                        if (i == 0 && i3 == 0) {
                            if (f == 1 || f == 3 || f == 4) {
                                List<C78019ym2> j0 = eVar.mo75608j0();
                                this.f201615j = j0;
                                if (j0 == null || ((LinkedList) j0).size() == 0) {
                                    View findViewById = findViewById(C0966R.C0970id.f358831ha1);
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(0);
                                    View view = findViewById;
                                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    this.f201611f.setVisibility(8);
                                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93171d(this);
                                    C85405m.m105415e(11);
                                } else {
                                    LinkedList linkedList = new LinkedList();
                                    int i4 = 0;
                                    for (C78019ym2 next : this.f201615j) {
                                        if (((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69724s3(next.f228622d)) {
                                            linkedList.add(i4, next);
                                            i4++;
                                        } else if (!Util.isNullOrNil(next.f228622d) && !Util.isNullOrNil(next.f228627i)) {
                                            linkedList.add(next);
                                        }
                                    }
                                    ((LinkedList) this.f201615j).clear();
                                    this.f201615j = linkedList;
                                    if (linkedList.size() == 0) {
                                        View findViewById2 = findViewById(C0966R.C0970id.f358831ha1);
                                        C9556a aVar2 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                        aVar2.mo10233c(0);
                                        View view2 = findViewById2;
                                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        this.f201611f.setVisibility(8);
                                    } else {
                                        View findViewById3 = findViewById(C0966R.C0970id.f358831ha1);
                                        C9556a aVar3 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                        aVar3.mo10233c(8);
                                        View view3 = findViewById3;
                                        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                        C117292a.m165359e(view3, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        mo96195J7();
                                        this.f201610e.notifyDataSetChanged();
                                        if (this.f201610e.getCount() > 0) {
                                            this.f201611f.setSelection(0);
                                        }
                                        this.f201611f.post(new C69878a(this));
                                    }
                                }
                                int i5 = this.f201618p;
                                if (i5 == 3) {
                                    setTitleLogo(0, C0966R.raw.ic_sex_male);
                                } else if (i5 == 4) {
                                    setTitleLogo(0, C0966R.raw.ic_sex_female);
                                } else {
                                    setTitleLogo(0, 0);
                                    this.f201618p = 1;
                                }
                                this.f201617o = true;
                                this.f201612g = null;
                            }
                            if (eVar.mo75607f() == 2) {
                                C76879j.m92749t(getContext(), getString(C0966R.string.h5g), "", new C69879b());
                                this.f201613h = null;
                            }
                            if (((C64319dn2) eVar.f153350e.f127056b.f127083a).f182783h == 1) {
                                String string = getString(C0966R.string.h67);
                                int i6 = ((C64319dn2) eVar.f153350e.f127056b.f127083a).f182784i;
                                if (this.f201619q != null) {
                                    View view4 = this.f201620r;
                                    if (view4 == null) {
                                        View inflate = View.inflate(this, C0966R.C0971layout.bk5, (ViewGroup) null);
                                        this.f201620r = inflate;
                                        this.f201619q.addView(inflate);
                                        this.f201620r.setOnClickListener(new C69931g(this));
                                    } else {
                                        C9556a aVar4 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                        aVar4.mo10233c(0);
                                        View view5 = view4;
                                        C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "showLbsroomEntry", "(Ljava/lang/String;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                        C117292a.m165359e(view5, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "showLbsroomEntry", "(Ljava/lang/String;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                    ((TextView) this.f201620r.findViewById(C0966R.C0970id.ha7)).setText(string);
                                    if (i6 != 0) {
                                        ((TextView) this.f201620r.findViewById(C0966R.C0970id.ha6)).setText(String.format(getResources().getQuantityString(C0966R.plurals.f7241w, i6, new Object[]{Integer.valueOf(i6)}), new Object[0]));
                                    }
                                }
                            } else {
                                View view6 = this.f201620r;
                                if (!(view6 == null || this.f201619q == null)) {
                                    C9556a aVar5 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                                    aVar5.mo10233c(8);
                                    View view7 = view6;
                                    C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "hideLbsroomEntryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view7, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "hideLbsroomEntryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                            this.f201623u = true;
                            return;
                        }
                        if (f == 1 || f == 3 || f == 4) {
                            TextView textView = (TextView) findViewById(C0966R.C0970id.f358831ha1);
                            textView.setVisibility(0);
                            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93171d(this);
                            C7660a a = (str == null || str.length() <= 0) ? null : C7660a.m7782a(str);
                            if (a != null && (str3 = a.f26001b) != null && str3.length() > 0) {
                                textView.setText(a.f26001b);
                            } else if (i3 == -2001) {
                                textView.setText(getString(C0966R.string.h5i));
                            } else {
                                textView.setText(getString(C0966R.string.h5m));
                            }
                            this.f201611f.setVisibility(8);
                            this.f201612g = null;
                        }
                        if (eVar.mo75607f() == 2) {
                            C76701a.makeText((Context) this, (int) C0966R.string.h5f, 1).show();
                            this.f201613h = null;
                        }
                    }
                }
            }
        } else if (yVar.getType() == 376) {
            C67354f fVar = (C67354f) yVar;
            if (((C77921en2) fVar.f193210e.f127055a.f127080a).f227250d == 1) {
                C89779i0 i0Var3 = this.f201609d;
                if (i0Var3 != null) {
                    i0Var3.dismiss();
                    this.f201609d = null;
                }
                if (i == 0 && i3 == 0 && (str2 = fVar.f193211f) != null) {
                    String str4 = fVar.f193212g;
                    C72996z1 z1Var = new C72996z1();
                    z1Var.mo62878U2(str4);
                    z1Var.setUsername(str2);
                    C44668u3 Ni = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni();
                    Log.m105918d("MicroMsg.LbsroomLogic", "Save lbsroom contact name:" + z1Var.getUsername());
                    if (!Ni.mo69709k3(z1Var.getUsername())) {
                        Ni.mo69667P3(z1Var);
                    }
                    C86709a0.m107535s().mo121142i().mo119676J(143873, str2);
                    C86709a0.m107535s().mo121142i().mo119676J(143874, Long.valueOf(Util.nowSecond()));
                    Intent intent = new Intent();
                    intent.putExtra("Chat_User", str2);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).getClass();
                    Log.m105925i("MicroMsg.WorkerUICallbackImpl with result", "startChattingUI %s", Util.getStack().toString());
                    intent.setClass(this, ChattingUI.class);
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar6.mo10233c(1);
                    aVar6.mo10233c(intent);
                    C117292a.m165364j(this, aVar6.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUIForResult", "(Landroid/content/Intent;ILandroid/content/Context;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    return;
                }
                C76879j.m92742m(getContext(), C0966R.string.h65, C0966R.string.a3h, new C69880c(this));
            }
        }
    }
}
