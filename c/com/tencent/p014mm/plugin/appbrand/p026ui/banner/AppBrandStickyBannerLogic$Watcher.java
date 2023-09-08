package com.tencent.p014mm.plugin.appbrand.p026ui.banner;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher */
final class AppBrandStickyBannerLogic$Watcher extends MainProcessTask {
    public static final Parcelable.Creator<AppBrandStickyBannerLogic$Watcher> CREATOR = new C84490b();

    /* renamed from: i */
    public static final transient Map<String, C84498l> f246597i = new HashMap();

    /* renamed from: f */
    public String f246598f;

    /* renamed from: g */
    public String f246599g;

    /* renamed from: h */
    public int f246600h;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher$a */
    public class C84489a implements C84498l {
        public C84489a() {
        }

        /* renamed from: R3 */
        public void mo94342R3(String str, int i) {
            AppBrandStickyBannerLogic$Watcher appBrandStickyBannerLogic$Watcher = AppBrandStickyBannerLogic$Watcher.this;
            appBrandStickyBannerLogic$Watcher.f246599g = str;
            appBrandStickyBannerLogic$Watcher.f246600h = i;
            appBrandStickyBannerLogic$Watcher.mo114394b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher$b */
    public class C84490b implements Parcelable.Creator<AppBrandStickyBannerLogic$Watcher> {
        public Object createFromParcel(Parcel parcel) {
            AppBrandStickyBannerLogic$Watcher appBrandStickyBannerLogic$Watcher = new AppBrandStickyBannerLogic$Watcher();
            appBrandStickyBannerLogic$Watcher.mo1551g(parcel);
            return appBrandStickyBannerLogic$Watcher;
        }

        public Object[] newArray(int i) {
            return new AppBrandStickyBannerLogic$Watcher[i];
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f246598f = parcel.readString();
        this.f246599g = parcel.readString();
        this.f246600h = parcel.readInt();
    }

    /* renamed from: i */
    public void mo1552i() {
        String str = this.f246599g;
        int i = this.f246600h;
        Set<C84498l> set = C84496e.f246615a;
        synchronized (set) {
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ((C84498l) it.next()).mo94342R3(str, i);
            }
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        if (!Util.isNullOrNil(this.f246598f)) {
            Map<String, C84498l> map = f246597i;
            synchronized (map) {
                if (((HashMap) map).containsKey(this.f246598f)) {
                    C84498l lVar = (C84498l) ((HashMap) map).get(this.f246598f);
                    if (lVar != null) {
                        Set<C84498l> set = C68645f.f197194a;
                        synchronized (set) {
                            ((HashSet) set).remove(lVar);
                        }
                    } else {
                        Set<C84498l> set2 = C68645f.f197194a;
                    }
                }
                C84489a aVar = new C84489a();
                Set<C84498l> set3 = C68645f.f197194a;
                synchronized (set3) {
                    ((HashSet) set3).add(aVar);
                }
                ((HashMap) map).put(this.f246598f, aVar);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246598f);
        parcel.writeString(this.f246599g);
        parcel.writeInt(this.f246600h);
    }
}
