package com.tencent.p014mm.plugin.appbrand.outerwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.RemoteViews;
import bw0.C79851a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.outerwidget.Service.AppBrandWidgetGridService;
import com.tencent.p014mm.plugin.appbrand.outerwidget.entry.WidgetEntryActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import f40.C86709a0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import lb0.C88394b;
import mq0.C88827d;
import mq0.C88828e;
import mq0.C88829f;
import mq0.C88830g;
import mu3.C109639a;
import pq0.C35612a;
import pq0.C35613b;

/* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget */
public class AppBrandOuterWidget extends AppWidgetProvider {

    /* renamed from: a */
    public static MStorage.IOnStorageChange f244363a = new C83718a();

    /* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget$a */
    public class C83718a implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget$a$a */
        public class C83719a implements C88827d {
            public C83719a(C83718a aVar) {
            }

            /* renamed from: a */
            public void mo116004a() {
                Context context = MMApplicationContext.getContext();
                AppWidgetManager instance = AppWidgetManager.getInstance(context);
                instance.notifyAppWidgetViewDataChanged(instance.getAppWidgetIds(new ComponentName(context, AppBrandOuterWidget.class)), C0966R.C0970id.n56);
            }
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            AppBrandOuterWidget.m102763d(new C83719a(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget$b */
    public class C83720b implements C88827d {
        /* renamed from: a */
        public void mo116004a() {
            AppBrandOuterWidget.m102761b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget$c */
    public class C83721c implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ Bitmap[] f244364d;

        /* renamed from: e */
        public final /* synthetic */ int f244365e;

        /* renamed from: f */
        public final /* synthetic */ C88827d f244366f;

        public C83721c(Bitmap[] bitmapArr, int i, C88827d dVar) {
            this.f244364d = bitmapArr;
            this.f244365e = i;
            this.f244366f = dVar;
        }

        /* renamed from: b */
        public void mo1907b() {
            Bitmap decodeResource = BitmapFactory.decodeResource(MMApplicationContext.getResources(), C0966R.C0969drawable.c8n);
            this.f244364d[this.f244365e] = BitmapUtil.getRoundedCornerBitmap(decodeResource, false, (float) (decodeResource.getWidth() / 2), false);
            int i = this.f244365e;
            Bitmap[] bitmapArr = this.f244364d;
            if (i == bitmapArr.length - 1) {
                C88830g.f256241c.f256243b = bitmapArr;
                this.f244366f.mo116004a();
            }
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return null;
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            Bitmap[] bitmapArr = this.f244364d;
            int i = this.f244365e;
            bitmapArr[i] = bitmap;
            if (i == bitmapArr.length - 1) {
                C88830g.f256241c.f256243b = bitmapArr;
                this.f244366f.mo116004a();
            }
        }
    }

    /* renamed from: a */
    public static void m102760a(RemoteViews remoteViews, int i, String str, int i2) {
        Context context = MMApplicationContext.getContext();
        Intent intent = new Intent(context, WidgetEntryActivity.class);
        intent.putExtra("extra_action", str);
        intent.addFlags(67108864);
        remoteViews.setOnClickPendingIntent(i, PendingIntent.getActivity(context, i2, intent, 134217728));
    }

    /* renamed from: b */
    public static void m102761b() {
        Context context = MMApplicationContext.getContext();
        String packageName = context.getPackageName();
        List<C88828e> list = C88830g.f256241c.f256242a;
        RemoteViews remoteViews = new RemoteViews(packageName, list == null ? C0966R.C0971layout.cu5 : C88829f.f256240a[list.size()]);
        remoteViews.setRemoteAdapter(C0966R.C0970id.n56, new Intent(context, AppBrandWidgetGridService.class));
        remoteViews.setEmptyView(C0966R.C0970id.n56, C0966R.C0970id.n57);
        m102760a(remoteViews, C0966R.C0970id.nd_, "action_click_bg", 3);
        remoteViews.setPendingIntentTemplate(C0966R.C0970id.n56, PendingIntent.getActivity(context, 0, new Intent(context, WidgetEntryActivity.class), 134217728));
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        instance.updateAppWidget(instance.getAppWidgetIds(new ComponentName(context, AppBrandOuterWidget.class)), remoteViews);
    }

    /* renamed from: c */
    public static void m102762c(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            if (!C86709a0.m107522a()) {
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0966R.C0971layout.cu9);
                remoteViews.setTextViewText(C0966R.C0970id.n54, MMApplicationContext.getString(C0966R.string.dba));
                remoteViews.setTextViewText(C0966R.C0970id.f359589n53, MMApplicationContext.getString(C0966R.string.db_));
                m102760a(remoteViews, C0966R.C0970id.f359589n53, "action_go_to_login", 1);
                appWidgetManager.updateAppWidget(i, remoteViews);
            } else if (!C1510o.f10864a.mo1516a().getBoolean("check_authorization_key", false)) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), C0966R.C0971layout.cu9);
                remoteViews2.setTextViewText(C0966R.C0970id.n54, MMApplicationContext.getString(C0966R.string.db9));
                remoteViews2.setTextViewText(C0966R.C0970id.f359589n53, MMApplicationContext.getString(C0966R.string.db8));
                m102760a(remoteViews2, C0966R.C0970id.f359589n53, "action_authorize", 2);
                appWidgetManager.updateAppWidget(i, remoteViews2);
            } else {
                m102763d(new C83720b());
            }
        }
    }

    /* renamed from: d */
    public static void m102763d(C88827d dVar) {
        String str;
        C88830g gVar = C88830g.f256241c;
        Class cls = C35613b.class;
        C68585h1 h1Var = (C68585h1) C86312j.m106911c(C68585h1.class);
        if (h1Var != null) {
            List<LocalUsageInfo> pM = h1Var.mo94245pM(Integer.MAX_VALUE, C68585h1.C68586a.DESC);
            C35613b bVar = (C35613b) C81161g2.Bx0(cls);
            if (pM == null || bVar == null) {
                gVar.f256242a = null;
            } else {
                ArrayList arrayList = new ArrayList();
                bVar.mo60336jo();
                int i = 0;
                while (i < pM.size() && i < 4) {
                    LocalUsageInfo localUsageInfo = pM.get(i);
                    byte[] bytes = (localUsageInfo.f239040d + "," + C86709a0.m107523b().mo121110g() + "," + localUsageInfo.f239041e).getBytes();
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        instance.update(bytes);
                        str = String.format("%064x", new Object[]{new BigInteger(1, instance.digest())});
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    C88828e eVar = new C88828e(str, localUsageInfo.f239040d, localUsageInfo.f239041e, localUsageInfo.f239042f, localUsageInfo.f239043g, localUsageInfo.f239044h, localUsageInfo.f239046j);
                    C35613b bVar2 = (C35613b) C81161g2.Bx0(cls);
                    if (bVar2 != null && !Util.isNullOrNil(eVar.f256233a)) {
                        C35612a aVar = new C35612a();
                        aVar.field_token = eVar.f256233a;
                        boolean z = bVar2.get(aVar, new String[0]);
                        aVar.field_username = eVar.f256234b;
                        aVar.field_appid = eVar.f256235c;
                        aVar.field_appVersion = eVar.f256237e;
                        aVar.field_versionType = eVar.f256236d;
                        aVar.field_iconUrl = eVar.f256239g;
                        aVar.field_nickname = eVar.f256238f;
                        if (z) {
                            bVar2.update(aVar, new String[0]);
                        } else {
                            bVar2.insert(aVar);
                        }
                    }
                    arrayList.add(eVar);
                    i++;
                }
                gVar.f256242a = arrayList;
            }
        }
        C88830g gVar2 = C88830g.f256241c;
        List<C88828e> list = gVar2.f256242a;
        if (list == null || list.size() == 0) {
            C88827d dVar2 = dVar;
            dVar.mo116004a();
            return;
        }
        int size = gVar2.f256242a.size();
        Bitmap[] bitmapArr = new Bitmap[size];
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C83721c(bitmapArr, i2, dVar), C88830g.f256241c.f256242a.get(i2).f256239g, C79851a.f234000d);
        }
    }

    public void onDisabled(Context context) {
        List<LocalUsageInfo> pM;
        super.onDisabled(context);
        Log.m105924i("MicroMsg.AppBrandOuterWidget", "onDisabled");
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.remove(f244363a);
        }
        C68585h1 h1Var = (C68585h1) C86312j.m106911c(C68585h1.class);
        int i = -1;
        if (!(h1Var == null || (pM = h1Var.mo94245pM(Integer.MAX_VALUE, C68585h1.C68586a.DESC)) == null)) {
            i = pM.size();
        }
        AppBrandWidgetReportStruct appBrandWidgetReportStruct = new AppBrandWidgetReportStruct();
        appBrandWidgetReportStruct.f236362d = 1001;
        appBrandWidgetReportStruct.f236363e = 3;
        appBrandWidgetReportStruct.f236364f = i;
        appBrandWidgetReportStruct.mo86054n();
    }

    public void onEnabled(Context context) {
        List<LocalUsageInfo> pM;
        super.onEnabled(context);
        Log.m105924i("MicroMsg.AppBrandOuterWidget", "onEnabled");
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.add(C109639a.m148950a("AppBrandWidgetUpdateCollectionList"), f244363a);
        }
        C68585h1 h1Var = (C68585h1) C86312j.m106911c(C68585h1.class);
        int i = -1;
        if (!(h1Var == null || (pM = h1Var.mo94245pM(Integer.MAX_VALUE, C68585h1.C68586a.DESC)) == null)) {
            i = pM.size();
        }
        AppBrandWidgetReportStruct appBrandWidgetReportStruct = new AppBrandWidgetReportStruct();
        appBrandWidgetReportStruct.f236362d = 1001;
        appBrandWidgetReportStruct.f236363e = 1;
        appBrandWidgetReportStruct.f236364f = i;
        appBrandWidgetReportStruct.mo86054n();
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Log.m105925i("MicroMsg.AppBrandOuterWidget", "onReceive action: %s", intent.getAction());
    }

    public void onRestored(Context context, int[] iArr, int[] iArr2) {
        super.onRestored(context, iArr, iArr2);
        Log.m105924i("MicroMsg.AppBrandOuterWidget", "onRestored");
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        Log.m105924i("MicroMsg.AppBrandOuterWidget", "onUpdate");
        m102762c(context, appWidgetManager, iArr);
    }
}
