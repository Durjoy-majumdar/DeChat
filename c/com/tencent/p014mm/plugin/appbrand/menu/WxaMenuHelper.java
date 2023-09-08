package com.tencent.p014mm.plugin.appbrand.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import lp0.C88619a;
import np0.C34962b0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper */
public class WxaMenuHelper {

    /* renamed from: a */
    public final SparseArray<C88619a> f244274a;

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$b */
    public static class C83649b {

        /* renamed from: a */
        public static WxaMenuHelper f244275a = new WxaMenuHelper((C29602a) null);
    }

    public WxaMenuHelper(C29602a aVar) {
        SparseArray<C88619a> sparseArray = new SparseArray<>();
        this.f244274a = sparseArray;
        sparseArray.put(2, new C83698x());
        sparseArray.put(12, new C83680k());
        sparseArray.put(11, new C83688r());
        sparseArray.put(3, new C83691t());
        sparseArray.put(10, new C83694v());
        sparseArray.put(4, new C83692u());
        sparseArray.put(22, new C83679j());
        sparseArray.put(23, new C83690s());
        sparseArray.put(24, new C83653b());
        sparseArray.put(33, new C83695w());
        sparseArray.put(27, new C83682m());
        sparseArray.put(30, new C83661d());
        sparseArray.put(0, new C83655c());
        sparseArray.put(25, new C83677h());
        sparseArray.put(26, new C83671e());
        sparseArray.put(28, new C83672f());
        sparseArray.put(13, new C83650a());
        sparseArray.put(29, new C83684o());
        sparseArray.put(31, new C83683n());
        sparseArray.put(32, new C83674g());
    }

    /* renamed from: a */
    public static void m102685a(List<C83699y> list, int i, boolean z, boolean z2) {
        C83699y yVar = new C83699y(i, z, C83649b.f244275a.f244274a.get(i));
        yVar.f244319c = z2;
        list.add(yVar);
    }

    /* renamed from: b */
    public static long m102686b(String str) {
        GetCopyPathMenuExpireTimeTask getCopyPathMenuExpireTimeTask = new GetCopyPathMenuExpireTimeTask(str);
        getCopyPathMenuExpireTimeTask.mo114396f();
        return getCopyPathMenuExpireTimeTask.f80529g;
    }

    /* renamed from: c */
    public static boolean m102687c(C83699y yVar, String str, boolean z) {
        if (yVar != null) {
            return yVar.f244320d.mo120960g(str);
        }
        Log.m105928w("MicroMsg.AppBrand.WxaMenuHelper", "safeGetBoolean, menuInfo is null, key: " + str);
        return z;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$GetCopyPathMenuExpireTimeTask */
    public static class GetCopyPathMenuExpireTimeTask extends MainProcessTask {
        public static final Parcelable.Creator<GetCopyPathMenuExpireTimeTask> CREATOR = new C29601a();

        /* renamed from: f */
        public String f80528f;

        /* renamed from: g */
        public long f80529g = 0;

        /* renamed from: com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$GetCopyPathMenuExpireTimeTask$a */
        public class C29601a implements Parcelable.Creator<GetCopyPathMenuExpireTimeTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetCopyPathMenuExpireTimeTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetCopyPathMenuExpireTimeTask[i];
            }
        }

        public GetCopyPathMenuExpireTimeTask(String str) {
            this.f80528f = str;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f80529g = parcel.readLong();
            this.f80528f = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
            Long B = C34962b0.INSTANCE.mo59804B(this.f80528f, "copypath");
            if (B == null) {
                this.f80529g = 0;
            } else {
                this.f80529g = B.longValue();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f80529g);
            parcel.writeString(this.f80528f);
        }

        public GetCopyPathMenuExpireTimeTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
