package com.tencent.p014mm.plugin.appbrand.p026ui.banner;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$OperateTask */
final class AppBrandStickyBannerLogic$OperateTask extends MainProcessTask {
    public static final Parcelable.Creator<AppBrandStickyBannerLogic$OperateTask> CREATOR = new C84488a();

    /* renamed from: f */
    public int f246592f = 0;

    /* renamed from: g */
    public boolean f246593g;

    /* renamed from: h */
    public String f246594h;

    /* renamed from: i */
    public int f246595i;

    /* renamed from: j */
    public String f246596j;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$OperateTask$a */
    public class C84488a implements Parcelable.Creator<AppBrandStickyBannerLogic$OperateTask> {
        public Object createFromParcel(Parcel parcel) {
            AppBrandStickyBannerLogic$OperateTask appBrandStickyBannerLogic$OperateTask = new AppBrandStickyBannerLogic$OperateTask();
            appBrandStickyBannerLogic$OperateTask.mo1551g(parcel);
            return appBrandStickyBannerLogic$OperateTask;
        }

        public Object[] newArray(int i) {
            return new AppBrandStickyBannerLogic$OperateTask[i];
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f246592f = parcel.readInt();
        this.f246593g = parcel.readByte() != 0;
        this.f246594h = parcel.readString();
        this.f246595i = parcel.readInt();
        this.f246596j = parcel.readString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1553j() {
        /*
            r7 = this;
            int r0 = r7.f246592f
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x00ca
            r3 = 2
            if (r0 == r3) goto L_0x0012
            r1 = 3
            if (r0 == r1) goto L_0x000e
            goto L_0x00d1
        L_0x000e:
            java.util.Set<com.tencent.mm.plugin.appbrand.ui.banner.l> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f.f197194a
            goto L_0x00d1
        L_0x0012:
            java.util.Set<com.tencent.mm.plugin.appbrand.ui.banner.l> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f.f197194a
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x001b
            goto L_0x0078
        L_0x001b:
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.banner.BannerModel> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.BannerModel.class
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.ui.banner.BannerModel r3 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.BannerModel.f246602i     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x0024
            goto L_0x0078
        L_0x0024:
            java.lang.String r0 = r3.f246603d
            java.lang.String r4 = r7.f246594h
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0078
            int r0 = r3.f246604e
            int r4 = r7.f246595i
            if (r0 != r4) goto L_0x0078
            java.lang.String r2 = r3.f246603d
            java.lang.String r4 = r3.f246605f
            java.lang.String r3 = r3.f246606g
            java.lang.String r5 = r7.f246596j
            boolean r6 = f40.C86709a0.m107522a()
            if (r6 != 0) goto L_0x0043
            goto L_0x0079
        L_0x0043:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.put(r0)
            r6.put(r4)
            r6.put(r3)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r6.put(r0)
            java.lang.String r0 = r6.toString()
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.banner.c> r3 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84493c.class
            monitor-enter(r3)
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0075 }
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ all -> 0x0075 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_CHATTING_BANNER_INFO_STRING_SYNC     // Catch:{ all -> 0x0075 }
            r2.mo119677K(r4, r0)     // Catch:{ all -> 0x0075 }
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            throw r0
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x00d1
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.banner.BannerModel> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.BannerModel.class
            monitor-enter(r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.banner.j> r1 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84497j.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x00c4 }
            com.tencent.mm.plugin.appbrand.ui.banner.j r1 = (com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84497j) r1     // Catch:{ all -> 0x00c4 }
            com.tencent.mm.plugin.appbrand.ui.banner.BannerModel r1 = r1.mo117174PG()     // Catch:{ all -> 0x00c4 }
            com.tencent.p014mm.plugin.appbrand.p026ui.banner.BannerModel.f246602i = r1     // Catch:{ all -> 0x00c4 }
            com.tencent.mm.plugin.appbrand.ui.banner.BannerModel r1 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.BannerModel.f246602i     // Catch:{ all -> 0x00c4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x0093
            r0 = 0
            goto L_0x0095
        L_0x0093:
            java.lang.String r0 = r1.f246603d
        L_0x0095:
            if (r1 != 0) goto L_0x0099
            r1 = -1
            goto L_0x009b
        L_0x0099:
            int r1 = r1.f246604e
        L_0x009b:
            java.util.Set<com.tencent.mm.plugin.appbrand.ui.banner.l> r2 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f.f197194a
            monitor-enter(r2)
            r3 = r2
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x00a5:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00c1 }
            com.tencent.mm.plugin.appbrand.ui.banner.l r4 = (com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l) r4     // Catch:{ all -> 0x00c1 }
            r4.mo94342R3(r0, r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x00a5
        L_0x00b5:
            monitor-exit(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.banner.k> r2 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C29664k.class
            com.tencent.mm.plugin.appbrand.ui.banner.f$$a r3 = new com.tencent.mm.plugin.appbrand.ui.banner.f$$a
            r3.<init>(r0, r1)
            p261wl.C38166b.m41755b(r2, r3)
            goto L_0x00d1
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c1 }
            throw r0
        L_0x00c4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            throw r1
        L_0x00c7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r1
        L_0x00ca:
            java.util.Set<com.tencent.mm.plugin.appbrand.ui.banner.l> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f.f197194a
            r7.f246593g = r2
            r7.mo114394b()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.banner.AppBrandStickyBannerLogic$OperateTask.mo1553j():void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f246592f);
        parcel.writeByte(this.f246593g ? (byte) 1 : 0);
        parcel.writeString(this.f246594h);
        parcel.writeInt(this.f246595i);
        parcel.writeString(this.f246596j);
    }
}
