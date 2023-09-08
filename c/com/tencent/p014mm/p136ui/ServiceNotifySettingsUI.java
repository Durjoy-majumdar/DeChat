package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kb0.C33868l;
import kb0.C33869m;
import kr0.C76629w0;
import lb0.C88393a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p919sl.C77725b;
import qo3.C89779i0;
import rd0.C22222c;
import rd0.C48018e;
import te3.C49930j14;
import te3.C50927q82;
import te3.ce4;

/* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI */
public class ServiceNotifySettingsUI extends MMActivity implements C11385n {

    /* renamed from: o */
    public static final /* synthetic */ int f214618o = 0;

    /* renamed from: d */
    public MMSwitchBtn f214619d;

    /* renamed from: e */
    public ListView f214620e;

    /* renamed from: f */
    public C73140g f214621f;

    /* renamed from: g */
    public C89779i0 f214622g;

    /* renamed from: h */
    public DataSetObserver f214623h;

    /* renamed from: i */
    public int f214624i;

    /* renamed from: j */
    public String f214625j;

    /* renamed from: n */
    public String f214626n;

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$a */
    public class C73134a implements MenuItem.OnMenuItemClickListener {
        public C73134a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ServiceNotifySettingsUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$b */
    public class C73135b implements MMSwitchBtn.C7041b {
        public C73135b() {
        }

        public void onStatusChange(boolean z) {
            ServiceNotifySettingsUI serviceNotifySettingsUI = ServiceNotifySettingsUI.this;
            int i = ServiceNotifySettingsUI.f214618o;
            serviceNotifySettingsUI.getClass();
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, Boolean.valueOf(z));
        }
    }

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$c */
    public class C73136c extends DataSetObserver {
        public C73136c() {
        }

        public void onChanged() {
            View findViewById = ServiceNotifySettingsUI.this.findViewById(C0966R.C0970id.f358551fp1);
            int i = ServiceNotifySettingsUI.this.f214621f.isEmpty() ? 4 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/ServiceNotifySettingsUI$3", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/ServiceNotifySettingsUI$3", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$d */
    public class C73137d implements DialogInterface.OnCancelListener {
        public C73137d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ServiceNotifySettingsUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$e */
    public class C73138e implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ boolean f214631d;

        /* renamed from: e */
        public final /* synthetic */ boolean f214632e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList f214633f;

        /* renamed from: g */
        public final /* synthetic */ int f214634g;

        public C73138e(boolean z, boolean z2, LinkedList linkedList, int i) {
            this.f214631d = z;
            this.f214632e = z2;
            this.f214633f = linkedList;
            this.f214634g = i;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C97625j3.m125815e().mo123470p(1176, this);
            Log.m105925i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(BatchSwitchServiceNotifyOption), errType : %s, errCode : %s, errMsg : %s.", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C22222c a = C48018e.f128802a.mo72802a("name_wxa");
                for (int i3 = 0; i3 < this.f214633f.size(); i3++) {
                    ce4 ce4 = (ce4) this.f214633f.get(i3);
                    if (!(a == null || ce4 == null || Util.isNullOrNil(ce4.f131684f))) {
                        a.mo35374o(ce4.f131684f, ce4.f131683e == 1);
                    }
                }
                return;
            }
            C76912y0.makeText((Context) ServiceNotifySettingsUI.this, (int) C0966R.string.hdg, 0).show();
            if (this.f214631d) {
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, Boolean.valueOf(this.f214632e));
                ((C77725b) MvvmEventCenter.getEvent(C77725b.class)).publish();
            }
            Iterator it = this.f214633f.iterator();
            while (it.hasNext()) {
                UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
                UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
                aVar.f193996a = ((ce4) it.next()).f131684f;
                aVar.f193997b = 1;
                aVar.f193998c = this.f214634g;
                updateWxaOptionsEvent.publish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$f */
    public class C73139f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C50927q82 f214636d;

        public C73139f(C50927q82 q822) {
            this.f214636d = q822;
        }

        public void run() {
            ServiceNotifySettingsUI serviceNotifySettingsUI = ServiceNotifySettingsUI.this;
            if (serviceNotifySettingsUI.f214624i == 1) {
                LinkedList<C49930j14> linkedList = this.f214636d.f140185g;
                serviceNotifySettingsUI.getClass();
                LinkedList linkedList2 = new LinkedList();
                Iterator<C49930j14> it = linkedList.iterator();
                while (it.hasNext()) {
                    C49930j14 next = it.next();
                    C73140g.C73144b bVar = new C73140g.C73144b();
                    bVar.f214650a = next.f135818d;
                    bVar.f214652c = next.f135820f;
                    bVar.f214651b = next.f135821g;
                    linkedList2.add(bVar);
                }
                C73140g gVar = serviceNotifySettingsUI.f214621f;
                gVar.f214642h.clear();
                if (!linkedList2.isEmpty()) {
                    gVar.f214642h.addAll(linkedList2);
                }
                serviceNotifySettingsUI.f214621f.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$g */
    public static class C73140g extends BaseAdapter {

        /* renamed from: d */
        public Context f214638d;

        /* renamed from: e */
        public int f214639e;

        /* renamed from: f */
        public String f214640f;

        /* renamed from: g */
        public LayoutInflater f214641g;

        /* renamed from: h */
        public LinkedList<C73144b> f214642h = new LinkedList<>();

        /* renamed from: i */
        public LinkedList<C73144b> f214643i = new LinkedList<>();

        /* renamed from: j */
        public View.OnClickListener f214644j;

        /* renamed from: n */
        public C20937c f214645n;

        /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$g$a */
        public class C73141a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f214646d;

            /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$g$a$a */
            public class C73142a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ String f214648d;

                public C73142a(String str) {
                    this.f214648d = str;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = 0;
                    while (i2 < C73140g.this.f214642h.size()) {
                        C73144b bVar = C73140g.this.f214642h.get(i2);
                        if (bVar == null || !this.f214648d.equals(bVar.f214650a)) {
                            i2++;
                        } else {
                            C73140g gVar = C73140g.this;
                            gVar.f214643i.add(gVar.f214642h.remove(i2));
                            C73140g.this.notifyDataSetChanged();
                            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.f214648d);
                            String str = N2 == null ? "" : N2.field_appId;
                            if (C73141a.this.f214646d == 1) {
                                Log.m105919d("MicroMsg.ServiceNotifySettingsUI", "stev report(%s), eventId : %s, appId %s, mSceneId %s", 13798, 4, str, C73140g.this.f214640f);
                                C115669n.INSTANCE.mo160131h(13798, 4, str, 0, C73140g.this.f214640f, Long.valueOf(Util.nowSecond()));
                                return;
                            }
                            C115669n.INSTANCE.mo160131h(13796, 12, str, "", 0, Long.valueOf(Util.nowSecond()));
                            return;
                        }
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$g$a$b */
            public class C73143b implements DialogInterface.OnClickListener {
                public C73143b(C73141a aVar) {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }

            public C73141a(int i) {
                this.f214646d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Context context = view.getContext();
                int i = this.f214646d;
                C76879j.m92741l(context, i == 1 ? C0966R.string.hda : C0966R.string.hdd, 0, i == 1 ? C0966R.string.hdb : C0966R.string.a18, C0966R.string.auj, false, new C73142a(str), new C73143b(this), C0966R.color.f3536x0);
                C117292a.m165361g(this, "com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$g$b */
        public static class C73144b {

            /* renamed from: a */
            public String f214650a;

            /* renamed from: b */
            public String f214651b;

            /* renamed from: c */
            public String f214652c;
        }

        /* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI$g$c */
        public static class C73145c {

            /* renamed from: a */
            public ImageView f214653a;

            /* renamed from: b */
            public TextView f214654b;

            /* renamed from: c */
            public TextView f214655c;
        }

        public C73140g(Context context, LayoutInflater layoutInflater, int i, String str) {
            this.f214638d = context;
            this.f214639e = i;
            this.f214640f = str;
            this.f214641g = layoutInflater;
            this.f214644j = new C73141a(i);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59364t = true;
            bVar.f59362r = C88393a.m110230a();
            this.f214645n = bVar.mo32666a();
        }

        public int getCount() {
            return this.f214642h.size();
        }

        public Object getItem(int i) {
            return this.f214642h.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C73145c cVar;
            C73144b bVar = this.f214642h.get(i);
            if (view == null) {
                view = this.f214641g.inflate(C0966R.C0971layout.bwq, viewGroup, false);
                cVar = new C73145c();
                cVar.f214653a = (ImageView) view.findViewById(C0966R.C0970id.a1r);
                cVar.f214654b = (TextView) view.findViewById(C0966R.C0970id.f359390ko1);
                cVar.f214655c = (TextView) view.findViewById(C0966R.C0970id.f359090is2);
                view.setTag(cVar);
            } else {
                cVar = (C73145c) view.getTag();
            }
            C20828a.m22825b().mo32519h(bVar.f214651b, cVar.f214653a, this.f214645n);
            cVar.f214654b.setText(bVar.f214652c);
            if (this.f214639e == 1) {
                cVar.f214655c.setText(this.f214638d.getString(C0966R.string.f361108hd3));
            } else {
                cVar.f214655c.setText(this.f214638d.getString(C0966R.string.hd4));
            }
            cVar.f214655c.setTag(bVar.f214650a);
            cVar.f214655c.setOnClickListener(this.f214644j);
            return view;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bwr;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f214624i = intent.getIntExtra("mode", 0);
        this.f214625j = intent.getStringExtra("scene_id");
        this.f214626n = intent.getStringExtra("from_scene");
        intent.putExtra("scene_id", this.f214625j);
        String stringExtra = intent.getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (TextUtils.isEmpty(stringExtra)) {
            setMMTitle((int) C0966R.string.hdo);
        } else {
            setMMTitle(stringExtra);
        }
        setBackBtn(new C73134a());
        this.f214619d = (MMSwitchBtn) findViewById(C0966R.C0970id.bab);
        this.f214620e = (ListView) findViewById(C0966R.C0970id.fph);
        ((TextView) findViewById(C0966R.C0970id.f358551fp1)).setText(this.f214624i == 1 ? C0966R.string.hcq : C0966R.string.hcl);
        ((TextView) findViewById(C0966R.C0970id.knq)).setText(this.f214624i == 1 ? C0966R.string.hcs : C0966R.string.hcu);
        if (this.f214624i == 0) {
            View findViewById = findViewById(C0966R.C0970id.la6);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/ServiceNotifySettingsUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/ServiceNotifySettingsUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById.findViewById(C0966R.C0970id.la5);
            mMSwitchBtn.setCheck(C97625j3.m125812b().mo105906u().mo119686g(C72994y1.C72995a.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, true));
            mMSwitchBtn.setSwitchListener(new C73135b());
        }
        C73140g gVar = new C73140g(this, getLayoutInflater(), this.f214624i, this.f214625j);
        this.f214621f = gVar;
        this.f214620e.setAdapter(gVar);
        C73136c cVar = new C73136c();
        this.f214623h = cVar;
        this.f214621f.registerDataSetObserver(cVar);
        if (this.f214624i == 1) {
            C97625j3.m125815e().mo123455a(1145, this);
            C97625j3.m125815e().mo123460f(new C33869m(12));
            this.f214622g = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C73137d());
        }
        MMSwitchBtn mMSwitchBtn2 = this.f214619d;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
        if (this.f214624i == 1) {
            aVar2 = C72994y1.C72995a.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
        }
        mMSwitchBtn2.setCheck(C97625j3.m125812b().mo105906u().mo119686g(aVar2, true));
    }

    public void onDestroy() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
        C97625j3.m125815e().mo123470p(1145, this);
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
        boolean g = C97625j3.m125812b().mo105906u().mo119686g(this.f214624i == 1 ? aVar : aVar2, true);
        boolean z = this.f214619d.f220433y != g;
        LinkedList linkedList = new LinkedList();
        int i = 3;
        if (z) {
            ce4 ce4 = new ce4();
            ce4.f131683e = this.f214619d.f220433y ? 1 : 0;
            ce4.f131682d = this.f214624i == 1 ? 2 : 0;
            linkedList.add(ce4);
            boolean z2 = !g;
            if (this.f214624i != 1) {
                aVar = aVar2;
            }
            C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.valueOf(z2));
            ((C77725b) MvvmEventCenter.getEvent(C77725b.class)).publish();
            if (this.f214624i == 1) {
                int i2 = ce4.f131683e == 1 ? 3 : 2;
                Log.m105919d("MicroMsg.ServiceNotifySettingsUI", "stev report(%s), eventId : %s, mSceneId %s", 13798, Integer.valueOf(i2), this.f214625j);
                C115669n.INSTANCE.mo160131h(13798, Integer.valueOf(i2), "", 0, this.f214625j, Long.valueOf(Util.nowSecond()));
            } else {
                C115669n.INSTANCE.mo160131h(13796, Integer.valueOf(ce4.f131683e == 1 ? 11 : 10), "", "", 0, Long.valueOf(Util.nowSecond()));
            }
            if ("scene_service_notify_conversation".equals(this.f214626n)) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[8];
                objArr[0] = 3;
                objArr[1] = null;
                objArr[2] = Long.valueOf(Util.nowSecond());
                objArr[3] = null;
                objArr[4] = null;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = Integer.valueOf(this.f214619d.f220433y ? 1 : 2);
                nVar.mo160131h(21825, objArr);
            }
        }
        int i3 = this.f214624i == 1 ? 2 : 1;
        LinkedList<C73140g.C73144b> linkedList2 = this.f214621f.f214643i;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            if (this.f214624i != 1) {
                i = 1;
            }
            Iterator<C73140g.C73144b> it = linkedList2.iterator();
            while (it.hasNext()) {
                C73140g.C73144b next = it.next();
                ce4 ce42 = new ce4();
                ce42.f131684f = next.f214650a;
                ce42.f131682d = i;
                ce42.f131683e = 1;
                linkedList.add(ce42);
                UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
                UpdateWxaOptionsEvent.C67810a aVar3 = updateWxaOptionsEvent.f193994d;
                aVar3.f193996a = next.f214650a;
                aVar3.f193997b = 2;
                aVar3.f193998c = i3;
                updateWxaOptionsEvent.publish();
            }
        }
        if (!linkedList.isEmpty()) {
            C97625j3.m125815e().mo123455a(1176, new C73138e(z, g, linkedList, i3));
            C97625j3.m125815e().mo123460f(new C33868l(linkedList));
        }
        this.f214621f.unregisterDataSetObserver(this.f214623h);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f214622g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        Log.m105925i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(GetServiceNotifyOptions), errType : %s, errCode : %s, errMsg : %s.", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C50927q82 q822 = (C50927q82) ((C33869m) yVar).f91518d.f127056b.f127083a;
            if (this.f214624i == 1) {
                this.f214619d.setCheck(q822.f140184f);
            } else {
                this.f214619d.setCheck(q822.f140182d);
            }
            runOnUiThread(new C73139f(q822));
            return;
        }
        C76912y0.makeText((Context) this, (int) C0966R.string.f361106hd1, 0).show();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        hashSet.add(C57842n3.class);
    }
}
