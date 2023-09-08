package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82969i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import p214om.C11502f;
import p755xs.C102720b;
import pj3.C47511g;
import rb0.C48009v0;
import sf0.C101594c0;
import sn2.C48433d;
import un2.C102055a;
import un2.C102057c;
import un2.C78239b;

/* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI */
public class TVInfoUI extends MMPreference implements C101594c0.C101595a, C11385n {

    /* renamed from: q */
    public static final /* synthetic */ int f273389q = 0;

    /* renamed from: d */
    public C47511g f273390d;

    /* renamed from: e */
    public ImageView f273391e;

    /* renamed from: f */
    public String f273392f = "";

    /* renamed from: g */
    public TextView f273393g;

    /* renamed from: h */
    public TextView f273394h;

    /* renamed from: i */
    public C102057c.C102058a f273395i;

    /* renamed from: j */
    public long f273396j;

    /* renamed from: n */
    public boolean f273397n = false;

    /* renamed from: o */
    public C78239b f273398o;

    /* renamed from: p */
    public boolean f273399p = false;

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI$a */
    public class C94542a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C102057c.C102058a f273400d;

        public C94542a(C102057c.C102058a aVar) {
            this.f273400d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/TVInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(10987, 2, this.f273400d.field_playstatid, "", "");
            TVInfoUI.m119547H7(TVInfoUI.this, this.f273400d.field_playurl);
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/TVInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI$b */
    public class C94543b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C102057c.C102058a f273402d;

        public C94543b(C102057c.C102058a aVar) {
            this.f273402d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/TVInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(10987, 2, this.f273402d.field_playstatid, "", "");
            TVInfoUI.m119547H7(TVInfoUI.this, this.f273402d.field_playurl);
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/TVInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI$c */
    public class C94544c implements MenuItem.OnMenuItemClickListener {
        public C94544c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String str;
            TVInfoUI tVInfoUI = TVInfoUI.this;
            int i = TVInfoUI.f273389q;
            tVInfoUI.getClass();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.add(tVInfoUI.getString(C0966R.string.llm));
            linkedList2.add(0);
            linkedList.add(tVInfoUI.getString(C0966R.string.lln));
            linkedList2.add(1);
            if (!tVInfoUI.getIntent().getBooleanExtra("key_is_favorite_item", false)) {
                linkedList.add(tVInfoUI.getString(C0966R.string.f361137hk2));
                linkedList2.add(2);
            } else if (tVInfoUI.getIntent().getBooleanExtra("key_can_delete_favorite_item", true)) {
                str = tVInfoUI.getString(C0966R.string.f7944x1);
                C76879j.m92733d(tVInfoUI, "", linkedList, linkedList2, str, false, new C94551f(tVInfoUI));
                return true;
            }
            str = "";
            C76879j.m92733d(tVInfoUI, "", linkedList, linkedList2, str, false, new C94551f(tVInfoUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI$d */
    public class C94545d implements MenuItem.OnMenuItemClickListener {
        public C94545d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TVInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI$e */
    public class C94546e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102057c.C102058a f273406d;

        public C94546e(C102057c.C102058a aVar) {
            this.f273406d = aVar;
        }

        public void run() {
            LinkedList<C102055a> linkedList;
            C47511g gVar;
            LinkedList<C102055a.C102056a> linkedList2;
            TVInfoUI tVInfoUI = TVInfoUI.this;
            C102057c.C102058a aVar = this.f273406d;
            int i = TVInfoUI.f273389q;
            tVInfoUI.getClass();
            if (!(aVar == null || (linkedList = aVar.f300547a) == null || linkedList.size() == 0 || (gVar = tVInfoUI.f273390d) == null)) {
                gVar.removeAll();
                for (int i2 = 0; i2 < aVar.f300547a.size(); i2++) {
                    C102055a aVar2 = aVar.f300547a.get(i2);
                    if (!(aVar2 == null || (linkedList2 = aVar2.f300539a) == null || linkedList2.size() == 0)) {
                        for (int i3 = 0; i3 < aVar2.f300539a.size(); i3++) {
                            String str = "" + ((i2 * 100) + i3);
                            C102055a.C102056a aVar3 = aVar2.f300539a.get(i3);
                            if (aVar3.f300540a == 2) {
                                Preference preference = new Preference(tVInfoUI);
                                preference.mo26273A(str);
                                preference.f121271G = C0966R.C0971layout.cax;
                                preference.mo69924H(Util.isNullOrNil(aVar3.f300541b) ? tVInfoUI.getResources().getString(C0966R.string.j6c) : aVar3.f300541b);
                                preference.mo7741E(String.format(tVInfoUI.getResources().getString(C0966R.string.j6b), new Object[]{108}));
                            } else {
                                List<String> list = aVar3.f300544e;
                                if (list == null || ((ArrayList) list).size() <= 0) {
                                    Preference preference2 = new Preference(tVInfoUI);
                                    preference2.mo26273A(str);
                                    preference2.f121271G = C0966R.C0971layout.cax;
                                    preference2.mo69924H(aVar3.f300541b);
                                    preference2.mo7741E(aVar3.f300542c);
                                    tVInfoUI.f273390d.mo72527k(preference2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    int i4 = 0;
                                    while (i4 < ((ArrayList) aVar3.f300544e).size() && i4 < 3 && (i4 != 2 || aVar3.f300541b.length() <= 4)) {
                                        arrayList.add((String) ((ArrayList) aVar3.f300544e).get(i4));
                                        i4++;
                                    }
                                    TVThumbPreference tVThumbPreference = new TVThumbPreference(tVInfoUI, (AttributeSet) null);
                                    tVThumbPreference.mo26273A(str);
                                    tVThumbPreference.f273415N = arrayList;
                                    tVThumbPreference.mo69924H(aVar3.f300541b);
                                    C47511g gVar2 = tVInfoUI.f273390d;
                                    tVThumbPreference.f273414M = gVar2;
                                    gVar2.mo72527k(tVThumbPreference);
                                }
                            }
                        }
                    }
                }
                tVInfoUI.f273390d.notifyDataSetChanged();
            }
            TVInfoUI tVInfoUI2 = TVInfoUI.this;
            C102057c.C102058a aVar4 = this.f273406d;
            tVInfoUI2.getClass();
            if (aVar4 != null && !Util.isNullOrNil(aVar4.field_thumburl)) {
                C78239b bVar = new C78239b(aVar4);
                tVInfoUI2.f273398o = bVar;
                tVInfoUI2.f273392f = bVar.mo94820d();
                Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(tVInfoUI2.f273398o);
                Log.m105919d("MicroMsg.TVInfoUI", "initHeaderImg photo = %s", N6);
                if (N6 != null) {
                    tVInfoUI2.f273391e.setImageBitmap(N6);
                    tVInfoUI2.f273399p = true;
                    tVInfoUI2.mo130027J7();
                    return;
                }
                tVInfoUI2.f273391e.setImageDrawable(tVInfoUI2.getResources().getDrawable(C0966R.raw.tv_info_thumb_default));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI$f */
    public class C94547f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f273408d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f273409e;

        public C94547f(String str, Bitmap bitmap) {
            this.f273408d = str;
            this.f273409e = bitmap;
        }

        public void run() {
            Bitmap bitmap;
            String str = TVInfoUI.this.f273392f;
            if (str != null && str.equals(this.f273408d)) {
                ImageView imageView = TVInfoUI.this.f273391e;
                if (!(imageView == null || (bitmap = this.f273409e) == null)) {
                    imageView.setImageBitmap(bitmap);
                    TVInfoUI.this.mo130027J7();
                }
                TVInfoUI.this.f273399p = true;
            }
            C47511g gVar = TVInfoUI.this.f273390d;
        }
    }

    /* renamed from: H7 */
    public static void m119547H7(TVInfoUI tVInfoUI, String str) {
        tVInfoUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        intent.putExtra("geta8key_scene", 10);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, tVInfoUI);
    }

    /* renamed from: I7 */
    public final void mo130026I7(C102057c.C102058a aVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
            finish();
            return;
        }
        this.f273393g.setText(aVar.field_title);
        if (Util.isNullOrNil(aVar.field_topic)) {
            this.f273394h.setVisibility(8);
        } else {
            this.f273394h.setText(aVar.field_topic);
        }
        this.f273391e = (ImageView) findViewById(C0966R.C0970id.kyw);
        if (!Util.isNullOrNil(aVar.field_playurl)) {
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.kyv);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new C94542a(aVar));
            this.f273391e.setOnClickListener(new C94543b(aVar));
        }
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C94544c());
        if (!Util.isNullOrNil(aVar.field_id) && !this.f273397n && !getIntent().getBooleanExtra("key_TV_come_from_shake", false)) {
            int intExtra = getIntent().getIntExtra("key_TV_getProductInfoScene", 0);
            Log.m105919d("MicroMsg.TVInfoUI", "GetTVInfo id[%s], scene[%s]", aVar.field_id, Integer.valueOf(intExtra));
            C97625j3.m125815e().mo123460f(new C48433d(aVar.field_id, intExtra));
            this.f273397n = true;
        }
        this.f273391e.setVisibility(0);
        setBackBtn(new C94545d());
        Log.m105926v("MicroMsg.TVInfoUI", "start postToMainThread initBodyView");
        MMHandlerThread.postToMainThread(new C94546e(aVar));
    }

    /* renamed from: J7 */
    public final void mo130027J7() {
        long longExtra = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0);
        this.f273396j = longExtra;
        if (longExtra > 0 && C97625j3.m125811a()) {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f273396j);
            if (b002.getMsgId() > 0) {
                b002.mo108739S2(this.f273398o.mo94827k());
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f273396j, b002);
            }
        }
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.caw;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cav;
    }

    public int getResourceId() {
        return C0966R.xml.f8981d4;
    }

    public void initView() {
        byte[] byteArrayExtra;
        setMMTitle((int) C0966R.string.ies);
        this.f273390d = getPreferenceScreen();
        this.f273393g = (TextView) findViewById(C0966R.C0970id.kyx);
        this.f273394h = (TextView) findViewById(C0966R.C0970id.kyy);
        String stringExtra = getIntent().getStringExtra("key_TV_xml");
        if (Util.isNullOrNil(stringExtra) && (byteArrayExtra = getIntent().getByteArrayExtra("key_TV_xml_bytes")) != null) {
            stringExtra = new String(byteArrayExtra);
        }
        Log.m105919d("MicroMsg.TVInfoUI", "tvinfo xml : %s", stringExtra);
        C102057c.C102058a b = C102057c.m134444b(stringExtra);
        this.f273395i = b;
        if (b == null) {
            Log.m105920e("MicroMsg.TVInfoUI", "initView(), tv == null");
            finish();
            return;
        }
        mo130026I7(b);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (str != null) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(bitmap == null);
            Log.m105919d("MicroMsg.TVInfoUI", "onGetPictureFinish pic, url = [%s], bitmap is null ? [%B]", objArr);
            try {
                MMHandlerThread.postToMainThread(new C94547f(str, bitmap));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", e.getLocalizedMessage());
                Log.printErrStackTrace("MicroMsg.TVInfoUI", e, "", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.TVInfoUI", "onUpdateEnable pic, url  is null ");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C102720b) C86312j.m106911c(C102720b.class)).U70(this);
        initView();
    }

    public void onDestroy() {
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this);
        super.onDestroy();
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C82969i.CTRL_INDEX, this);
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C11502f.class;
        Log.m105919d("MicroMsg.TVInfoUI", "onPreferenceTreeClick item: [%s]", preference.f121285r);
        C102057c.C102058a aVar = this.f273395i;
        if (aVar == null || aVar.f300547a == null) {
            Log.m105920e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
            return false;
        }
        try {
            int intValue = Integer.valueOf(preference.f121285r).intValue();
            int i = intValue / 100;
            int i2 = intValue % 100;
            Log.m105927v("MicroMsg.TVInfoUI", "keyId=[%s], ii=[%s], jj=[%s]", Integer.valueOf(intValue), Integer.valueOf(i), Integer.valueOf(i2));
            if (i >= 0) {
                if (i < this.f273395i.f300547a.size()) {
                    C102055a aVar2 = this.f273395i.f300547a.get(i);
                    if (aVar2 == null) {
                        Log.m105928w("MicroMsg.TVInfoUI", "actionList == null");
                        return false;
                    }
                    if (i2 >= 0) {
                        if (i2 < aVar2.f300539a.size()) {
                            C102055a.C102056a aVar3 = aVar2.f300539a.get(i2);
                            if (aVar3 == null) {
                                Log.m105928w("MicroMsg.TVInfoUI", "action == null");
                                return false;
                            }
                            Log.m105926v("MicroMsg.TVInfoUI", "action type:" + aVar3.f300540a + ", target:" + aVar3.f300543d + ", targetDesc:" + aVar3.f300545f + ", targetDesc2:" + aVar3.f300546g);
                            int i3 = aVar3.f300540a;
                            if (i3 == 3) {
                                Intent intent = new Intent();
                                intent.putExtra("rawUrl", aVar3.f300543d);
                                intent.putExtra("show_bottom", false);
                                intent.putExtra("geta8key_scene", 10);
                                intent.putExtra("srcUsername", aVar3.f300546g);
                                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent, this);
                            } else if (i3 == 4) {
                                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(aVar3.f300543d);
                                if (z1Var != null) {
                                    Intent intent2 = new Intent();
                                    if (z1Var.mo62927s3() && z1Var.mo62916m3()) {
                                        C48009v0.Fx0().mo72757SE(aVar3.f300543d);
                                        if (aVar3.f300545f.equals("1")) {
                                            intent2.putExtra("Chat_User", aVar3.f300543d);
                                            intent2.putExtra("finish_direct", true);
                                            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent2, this);
                                        }
                                    }
                                    intent2.putExtra("Contact_User", aVar3.f300543d);
                                    intent2.putExtra("force_get_contact", true);
                                    C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                                }
                            } else if (i3 == 5) {
                                GetA8KeyRedirectEvent getA8KeyRedirectEvent = new GetA8KeyRedirectEvent();
                                GetA8KeyRedirectEvent.C40113a aVar4 = getA8KeyRedirectEvent.f107573d;
                                aVar4.f107575a = 11;
                                aVar4.f107576b = aVar3.f300543d;
                                aVar4.f107577c = this;
                                getA8KeyRedirectEvent.callback = null;
                                getA8KeyRedirectEvent.asyncPublish(Looper.myLooper());
                            } else if (i3 == 6) {
                                Intent intent3 = new Intent();
                                intent3.putExtra("key_product_id", aVar3.f300543d);
                                intent3.putExtra("key_product_scene", 9);
                                C88144b.m109791i(this, "product", ".ui.MallProductUI", intent3, (Bundle) null);
                            }
                            return true;
                        }
                    }
                    Log.m105929w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", Integer.valueOf(i2), Integer.valueOf(aVar2.f300539a.size()));
                    return false;
                }
            }
            Log.m105929w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", Integer.valueOf(i), Integer.valueOf(this.f273395i.f300547a.size()));
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", e.getMessage());
            Log.printErrStackTrace("MicroMsg.TVInfoUI", e, "", new Object[0]);
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(C82969i.CTRL_INDEX, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r3 = r3.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r3, int r4, java.lang.String r5, ob0.C117747y r6) {
        /*
            r2 = this;
            java.lang.String r5 = "MicroMsg.TVInfoUI"
            if (r6 != 0) goto L_0x000b
            java.lang.String r3 = "scene == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r3)
            return
        L_0x000b:
            int r0 = r6.getType()
            r1 = 552(0x228, float:7.74E-43)
            if (r0 != r1) goto L_0x0098
            if (r3 != 0) goto L_0x0077
            if (r4 == 0) goto L_0x0018
            goto L_0x0077
        L_0x0018:
            un2.c$a r3 = r2.f273395i
            if (r3 != 0) goto L_0x0023
            java.lang.String r3 = "onSceneEnd tv == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r3)
            return
        L_0x0023:
            sn2.d r6 = (sn2.C48433d) r6
            ob0.c r3 = r6.f129605e
            if (r3 == 0) goto L_0x0032
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x0032
            te3.q92 r3 = (te3.C50932q92) r3
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 != 0) goto L_0x003c
            java.lang.String r3 = "onSceneEnd tvInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r3)
            return
        L_0x003c:
            java.lang.String r4 = r3.f140199e
            if (r4 == 0) goto L_0x0098
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "onSceneEnd  tvInfo.DescriptionXML != null, res:"
            r4.append(r6)
            java.lang.String r6 = r3.f140199e
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            java.lang.String r3 = r3.f140199e
            un2.c$a r3 = un2.C102057c.m134444b(r3)
            un2.c$a r4 = r2.f273395i
            if (r4 == 0) goto L_0x0098
            java.lang.String r4 = r4.field_xml
            if (r4 == 0) goto L_0x0098
            if (r3 == 0) goto L_0x0098
            java.lang.String r5 = r3.field_xml
            if (r5 == 0) goto L_0x0098
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0098
            r2.f273395i = r3
            r2.mo130026I7(r3)
            goto L_0x0098
        L_0x0077:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 0
            r6[r0] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r3] = r4
            java.lang.String r3 = "onSceneEnd() errType = [%s], errCode = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r6)
            r3 = 2131835320(0x7f1139b8, float:1.9303775E38)
            android.widget.Toast r3 = p910lj.C76701a.makeText((android.content.Context) r2, (int) r3, (int) r0)
            r3.show()
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.TVInfoUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
