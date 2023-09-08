package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent;
import com.tencent.p014mm.autogen.events.UpdateAppBrandNotifyMessageEvent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import hc0.C20937c;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kr0.C76629w0;
import lb0.C88393a;
import nj3.C76879j;
import ob0.C47350c;
import ob0.C89144l0;
import qo3.C89779i0;
import te3.C49654h34;
import te3.C49689hd2;
import te3.C49795i34;
import te3.C49831id2;
import te3.s65;

/* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI */
public class AppBrandNotifySettingsUI extends MMActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f214141j = 0;

    /* renamed from: d */
    public ListView f214142d;

    /* renamed from: e */
    public C73005d f214143e;

    /* renamed from: f */
    public C89779i0 f214144f;

    /* renamed from: g */
    public DataSetObserver f214145g;

    /* renamed from: h */
    public String f214146h;

    /* renamed from: i */
    public IListener<AppBrandNotifyMessageStatusChangedEvent> f214147i = new IListener<AppBrandNotifyMessageStatusChangedEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1390647424;
        }

        public boolean callback(IEvent iEvent) {
            AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent = (AppBrandNotifyMessageStatusChangedEvent) iEvent;
            if (AppBrandNotifySettingsUI.this.f214143e != null) {
                Log.m105924i("MicroMsg.AppBrandNotifySettingsUI", "change notify preferent status by event");
                C76629w0 w0Var = (C76629w0) C86312j.m106911c(C76629w0.class);
                for (int i = 0; i < AppBrandNotifySettingsUI.this.f214143e.getCount(); i++) {
                    C73005d.C73007b bVar = AppBrandNotifySettingsUI.this.f214143e.f214153e.get(i);
                    if (bVar != null) {
                        WxaAttributes N2 = w0Var.mo106879N2(bVar.f214158a);
                        if (N2 == null) {
                            Log.m105929w("MicroMsg.AppBrandNotifySettingsUI", "can't find local record, username:%s", bVar.f214158a);
                        } else if (Util.nullAsNil(N2.field_appId).equals(appBrandNotifyMessageStatusChangedEvent.f193472d.f193473a)) {
                            bVar.f214161d = appBrandNotifyMessageStatusChangedEvent.f193472d.f193474b;
                        }
                    }
                }
                AppBrandNotifySettingsUI.this.runOnUiThread(new C74784j(this));
            }
            return true;
        }
    };

    /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$a */
    public class C73002a implements MenuItem.OnMenuItemClickListener {
        public C73002a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppBrandNotifySettingsUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$b */
    public class C73003b implements DialogInterface.OnCancelListener {
        public C73003b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            AppBrandNotifySettingsUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$c */
    public class C73004c extends DataSetObserver {
        public C73004c() {
        }

        public void onChanged() {
            View findViewById = AppBrandNotifySettingsUI.this.findViewById(C0966R.C0970id.f358551fp1);
            int i = AppBrandNotifySettingsUI.this.f214143e.isEmpty() ? 4 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$4", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/AppBrandNotifySettingsUI$4", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d */
    public static class C73005d extends BaseAdapter {

        /* renamed from: d */
        public LayoutInflater f214152d;

        /* renamed from: e */
        public LinkedList<C73007b> f214153e = new LinkedList<>();

        /* renamed from: f */
        public LinkedList<C73007b> f214154f = new LinkedList<>();

        /* renamed from: g */
        public C73008c.C73010b f214155g = new C73006a();

        /* renamed from: h */
        public C20937c f214156h;

        /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$a */
        public class C73006a implements C73008c.C73010b {
            public C73006a() {
            }
        }

        /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$b */
        public static class C73007b {

            /* renamed from: a */
            public String f214158a;

            /* renamed from: b */
            public String f214159b;

            /* renamed from: c */
            public String f214160c;

            /* renamed from: d */
            public boolean f214161d;
        }

        /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c */
        public static class C73008c {

            /* renamed from: a */
            public C73007b f214162a;

            /* renamed from: b */
            public C73010b f214163b;

            /* renamed from: c */
            public MMSwitchBtn.C7041b f214164c = new C73009a();

            /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c$a */
            public class C73009a implements MMSwitchBtn.C7041b {
                public C73009a() {
                }

                public void onStatusChange(boolean z) {
                    C73008c cVar = C73008c.this;
                    C73010b bVar = cVar.f214163b;
                    if (bVar != null) {
                        C73007b bVar2 = cVar.f214162a;
                        C73006a aVar = (C73006a) bVar;
                        if (bVar2 == null) {
                            aVar.getClass();
                            return;
                        }
                        Iterator<C73007b> it = C73005d.this.f214153e.iterator();
                        while (it.hasNext()) {
                            C73007b next = it.next();
                            if (next != null && Util.nullAsNil(next.f214158a).equals(bVar2.f214158a)) {
                                if (bVar2.f214161d != z) {
                                    C73005d.this.f214154f.add(next);
                                    return;
                                } else {
                                    C73005d.this.f214154f.remove(next);
                                    return;
                                }
                            }
                        }
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c$b */
            public interface C73010b {
            }
        }

        /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$d */
        public static class C73011d {

            /* renamed from: a */
            public ImageView f214166a;

            /* renamed from: b */
            public TextView f214167b;

            /* renamed from: c */
            public MMSwitchBtn f214168c;

            /* renamed from: d */
            public View f214169d;
        }

        public C73005d(LayoutInflater layoutInflater) {
            this.f214152d = layoutInflater;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59364t = true;
            bVar.f59362r = C88393a.m110230a();
            this.f214156h = bVar.mo32666a();
        }

        public int getCount() {
            return this.f214153e.size();
        }

        public Object getItem(int i) {
            return this.f214153e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.tencent.mm.ui.AppBrandNotifySettingsUI$d$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                java.util.LinkedList<com.tencent.mm.ui.AppBrandNotifySettingsUI$d$b> r2 = r0.f214153e
                java.lang.Object r2 = r2.get(r1)
                com.tencent.mm.ui.AppBrandNotifySettingsUI$d$b r2 = (com.tencent.p014mm.p136ui.AppBrandNotifySettingsUI.C73005d.C73007b) r2
                r3 = 0
                if (r23 != 0) goto L_0x004d
                android.view.LayoutInflater r4 = r0.f214152d
                r5 = 2131493204(0x7f0c0154, float:1.8609882E38)
                r6 = r24
                android.view.View r4 = r4.inflate(r5, r6, r3)
                com.tencent.mm.ui.AppBrandNotifySettingsUI$d$d r5 = new com.tencent.mm.ui.AppBrandNotifySettingsUI$d$d
                r5.<init>()
                r6 = 2131297457(0x7f0904b1, float:1.821286E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r5.f214166a = r6
                r6 = 2131315364(0x7f094aa4, float:1.824918E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f214167b = r6
                r6 = 2131297254(0x7f0903e6, float:1.8212448E38)
                android.view.View r6 = r4.findViewById(r6)
                com.tencent.mm.ui.widget.MMSwitchBtn r6 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r6
                r5.f214168c = r6
                r6 = 2131297256(0x7f0903e8, float:1.8212452E38)
                android.view.View r6 = r4.findViewById(r6)
                r5.f214169d = r6
                r4.setTag(r5)
                goto L_0x0056
            L_0x004d:
                java.lang.Object r4 = r23.getTag()
                r5 = r4
                com.tencent.mm.ui.AppBrandNotifySettingsUI$d$d r5 = (com.tencent.p014mm.p136ui.AppBrandNotifySettingsUI.C73005d.C73011d) r5
                r4 = r23
            L_0x0056:
                gc0.a r6 = gc0.C20828a.m22825b()
                java.lang.String r7 = r2.f214159b
                android.widget.ImageView r8 = r5.f214166a
                hc0.c r9 = r0.f214156h
                r6.mo32519h(r7, r8, r9)
                android.widget.TextView r6 = r5.f214167b
                java.lang.String r7 = r2.f214160c
                r6.setText(r7)
                com.tencent.mm.ui.widget.MMSwitchBtn r6 = r5.f214168c
                boolean r7 = r2.f214161d
                r6.setCheck(r7)
                com.tencent.mm.ui.widget.MMSwitchBtn r6 = r5.f214168c
                java.lang.Object r6 = r6.getTag()
                if (r6 != 0) goto L_0x0091
                com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c r6 = new com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c
                r6.<init>()
                r6.f214162a = r2
                com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c$b r2 = r0.f214155g
                r6.f214163b = r2
                com.tencent.mm.ui.widget.MMSwitchBtn r2 = r5.f214168c
                com.tencent.mm.ui.widget.MMSwitchBtn$b r7 = r6.f214164c
                r2.setSwitchListener(r7)
                com.tencent.mm.ui.widget.MMSwitchBtn r2 = r5.f214168c
                r2.setTag(r6)
                goto L_0x009b
            L_0x0091:
                com.tencent.mm.ui.widget.MMSwitchBtn r6 = r5.f214168c
                java.lang.Object r6 = r6.getTag()
                com.tencent.mm.ui.AppBrandNotifySettingsUI$d$c r6 = (com.tencent.p014mm.p136ui.AppBrandNotifySettingsUI.C73005d.C73008c) r6
                r6.f214162a = r2
            L_0x009b:
                java.util.LinkedList<com.tencent.mm.ui.AppBrandNotifySettingsUI$d$b> r2 = r0.f214153e
                int r2 = r2.size()
                int r2 = r2 + -1
                if (r1 != r2) goto L_0x00e8
                android.view.View r1 = r5.f214169d
                r2 = 8
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.mo10233c(r2)
                java.lang.Object[] r7 = r5.mo10232b()
                java.lang.String r8 = "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter"
                java.lang.String r9 = "getView"
                java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r1
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r2 = r5.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r7 = "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter"
                java.lang.String r8 = "getView"
                java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x0128
            L_0x00e8:
                android.view.View r1 = r5.f214169d
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r5)
                java.lang.Object[] r14 = r2.mo10232b()
                java.lang.String r15 = "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r1
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r14 = "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            L_0x0128:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.AppBrandNotifySettingsUI.C73005d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: H7 */
    public static void m85889H7(AppBrandNotifySettingsUI appBrandNotifySettingsUI, LinkedList linkedList) {
        appBrandNotifySettingsUI.getClass();
        if (linkedList == null || linkedList.isEmpty()) {
            Log.m105924i("MicroMsg.AppBrandNotifySettingsUI", "saveNotifyMessageResult, configList is null or empty");
            return;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            s65 s65 = (s65) it.next();
            if (s65 == null) {
                Log.m105928w("MicroMsg.AppBrandNotifySettingsUI", "scene end, item is null");
            } else {
                UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new UpdateAppBrandNotifyMessageEvent();
                UpdateAppBrandNotifyMessageEvent.C67804a aVar = updateAppBrandNotifyMessageEvent.f193976d;
                aVar.f193977a = s65.f141352d;
                aVar.f193978b = s65.f141353e == 0;
                updateAppBrandNotifyMessageEvent.publish();
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6512gv;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f214146h = intent.getStringExtra("report_session_id");
        String stringExtra = intent.getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (TextUtils.isEmpty(stringExtra)) {
            setMMTitle((int) C0966R.string.b6x);
        } else {
            setMMTitle(stringExtra);
        }
        setBackBtn(new C73002a());
        this.f214142d = (ListView) findViewById(C0966R.C0970id.fph);
        C73005d dVar = new C73005d(getLayoutInflater());
        this.f214143e = dVar;
        this.f214142d.setAdapter(dVar);
        this.f214144f = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C73003b());
        C73004c cVar = new C73004c();
        this.f214145g = cVar;
        this.f214143e.registerDataSetObserver(cVar);
        C86709a0.m107523b().mo121110g();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49689hd2();
        bVar.f127067b = new C49831id2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getwxamsgconfig";
        bVar.f127069d = 357;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C89144l0.m111430f(bVar.mo72403a(), new C74789l(this), true, this);
        this.f214147i.alive();
    }

    public void onDestroy() {
        C76629w0 w0Var = (C76629w0) C86312j.m106911c(C76629w0.class);
        LinkedList<s65> linkedList = new LinkedList<>();
        LinkedList<C73005d.C73007b> linkedList2 = this.f214143e.f214154f;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            Iterator<C73005d.C73007b> it = linkedList2.iterator();
            while (it.hasNext()) {
                C73005d.C73007b next = it.next();
                s65 s65 = new s65();
                WxaAttributes N2 = w0Var.mo106879N2(next.f214158a);
                if (N2 == null) {
                    Log.m105925i("MicroMsg.AppBrandNotifySettingsUI", "get attribute fail, username: %s", next.f214158a);
                } else {
                    String str = N2.field_appId;
                    boolean z = next.f214161d;
                    s65.f141352d = str;
                    s65.f141353e = z ? 1 : 0;
                    linkedList.add(s65);
                    Log.m105919d("MicroMsg.AppBrandNotifySettingsUI", "stev report(%s), eventId : %d, appId %s, status %d", 19724, 5, str, Integer.valueOf(z));
                    C115669n.INSTANCE.mo160131h(19724, 1, 5, 0, 0, 0, null, 0, 0, 0, str, null, null, null, 0, null, null, 0, null, null, this.f214146h);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            C49654h34 h342 = new C49654h34();
            h342.f134432d = linkedList;
            h342.f134433e = 1;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127067b = new C49795i34();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/setwxamsgconfig";
            bVar.f127069d = 3872;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            bVar.f127066a = h342;
            C89144l0.m111429e(bVar.mo72403a(), new C74787k(this, linkedList), true);
        }
        this.f214143e.unregisterDataSetObserver(this.f214145g);
        this.f214147i.dead();
        super.onDestroy();
    }
}
