package b72;

import android.text.TextUtils;
import c72.C16867c;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import d72.C20446a;
import gy3.C24564k0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p1081gi.C98119b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p663qo.C101211h;

/* renamed from: b72.d */
public final class C16756d implements C16754b {

    /* renamed from: a */
    public C16755c f45286a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C20446a> f45287b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final CopyOnWriteArrayList<C16867c> f45288c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public final CopyOnWriteArrayList<C16759b> f45289d = new CopyOnWriteArrayList<>();

    /* renamed from: b72.d$a */
    public final class C16757a implements C98119b {
        public C16757a() {
        }

        /* renamed from: a */
        public int mo17770a(String str, C98120c cVar, C98121d dVar) {
            List<C16752a> a = C16756d.this.mo17763a(str);
            C16756d dVar2 = C16756d.this;
            StringBuilder sb = new StringBuilder();
            sb.append("progressFinishLength:");
            sb.append(cVar != null ? cVar.field_finishedLength : -123456);
            sb.append(" sceneResultRet:");
            sb.append(dVar != null ? dVar.field_retCode : -123456);
            if (!C16756d.m16358e(dVar2, str, a, "callback", "preloader", sb.toString())) {
                return 0;
            }
            ArrayList<C20446a> arrayList = new ArrayList<>();
            for (T next : a) {
                if (next instanceof C20446a) {
                    arrayList.add(next);
                }
            }
            for (C20446a aVar : arrayList) {
                if (cVar != null) {
                    Log.m105924i("MMMarsTaskDistributor", "callback preload by onProgress mediaId:" + str + " progressFinishLength:" + cVar.field_finishedLength + " task:" + aVar);
                    C87412m.m108591d(str);
                    aVar.mo1773g0(str, 0, cVar, dVar, false);
                }
            }
            return 1;
        }

        /* renamed from: b */
        public int mo17771b(String str, C98121d dVar) {
            List<C16752a> a = C16756d.this.mo17763a(str);
            C16756d dVar2 = C16756d.this;
            StringBuilder sb = new StringBuilder();
            sb.append("retCode:");
            sb.append(dVar != null ? dVar.field_retCode : -123456);
            if (!C16756d.m16358e(dVar2, str, a, "onPreloadCompleted", "preloader", sb.toString())) {
                return 0;
            }
            ArrayList<C20446a> arrayList = new ArrayList<>();
            for (T next : a) {
                if (next instanceof C20446a) {
                    arrayList.add(next);
                }
            }
            for (C20446a aVar : arrayList) {
                if (dVar != null) {
                    Log.m105924i("MMMarsTaskDistributor", "onPreloadCompleted preload by onPreloadCompleted mediaId:" + str + " retCode:" + dVar.field_retCode + " task:" + aVar);
                    C87412m.m108591d(str);
                    aVar.mo31987b(str, dVar);
                }
            }
            return 1;
        }

        /* renamed from: h */
        public void mo17772h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo17773j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: b72.d$c */
    public final class C16758c implements C101211h.C101212a {
        public C16758c() {
        }

        /* renamed from: a */
        public int mo17774a(String str, C98120c cVar, C98121d dVar) {
            List<C16752a> c = C16756d.this.mo17765c(str);
            C16756d dVar2 = C16756d.this;
            StringBuilder sb = new StringBuilder();
            sb.append("progressFinishLength:");
            sb.append(cVar != null ? cVar.field_finishedLength : -123456);
            sb.append(" sceneResultRet:");
            sb.append(dVar != null ? dVar.field_retCode : -123456);
            if (!C16756d.m16358e(dVar2, str, c, "callback", "downloader", sb.toString())) {
                return 0;
            }
            ArrayList<C16867c> arrayList = new ArrayList<>();
            for (T next : c) {
                if (next instanceof C16867c) {
                    arrayList.add(next);
                }
            }
            for (C16867c cVar2 : arrayList) {
                if (cVar != null) {
                    Log.m105924i("MMMarsTaskDistributor", "callback by downloader onProgress progressFinishLength:" + cVar.field_finishedLength + ' ' + cVar2 + ' ');
                    C87412m.m108591d(str);
                    cVar2.mo17917e(str, cVar.field_finishedLength, cVar.field_toltalLength);
                }
                if (dVar != null) {
                    Log.m105924i("MMMarsTaskDistributor", "callback by downloader onFinish sceneResultRet:" + dVar.field_retCode + ' ' + cVar2);
                    C87412m.m108591d(str);
                    cVar2.mo17918g(str, dVar.field_retCode, dVar);
                }
            }
            return 1;
        }

        /* renamed from: b */
        public int mo17775b(String str, int i, int i2) {
            return 0;
        }

        /* renamed from: c */
        public int mo17776c(String str, int i, int i2) {
            List<C16752a> c = C16756d.this.mo17765c(str);
            C16756d dVar = C16756d.this;
            if (!C16756d.m16358e(dVar, str, c, "onDataAvailable", "downloader", "offset:" + i + " length:" + i2)) {
                return 0;
            }
            ArrayList<C16867c> arrayList = new ArrayList<>();
            for (T next : c) {
                if (next instanceof C16867c) {
                    arrayList.add(next);
                }
            }
            for (C16867c cVar : arrayList) {
                Log.m105924i("MMMarsTaskDistributor", "onDataAvailable by downloader offset:" + i + " length:" + i2 + " task" + cVar);
                C87412m.m108591d(str);
                cVar.onDataAvailable(str, (long) i, (long) i2);
            }
            return 1;
        }

        /* renamed from: d */
        public int mo17777d(String str, int i, int i2, CdnLogic.VideoInfo videoInfo) {
            String str2 = str;
            int i3 = i;
            int i4 = i2;
            CdnLogic.VideoInfo videoInfo2 = videoInfo;
            String str3 = videoInfo2 != null ? videoInfo2.svrFlag : null;
            if (str3 == null) {
                str3 = "";
            }
            List<C16752a> c = C16756d.this.mo17765c(str);
            C16756d dVar = C16756d.this;
            if (!C16756d.m16358e(dVar, str, c, "onMoovReady", "downloader", "offset:" + i3 + " length:" + i4 + " svrflag:" + str3)) {
                return 0;
            }
            ArrayList<C16867c> arrayList = new ArrayList<>();
            for (T next : c) {
                if (next instanceof C16867c) {
                    arrayList.add(next);
                }
            }
            for (C16867c cVar : arrayList) {
                Log.m105924i("MMMarsTaskDistributor", "onMoovReady by downloader onMoovReady mediaId:" + str + " offset:" + i3 + " length:" + i4 + " task:" + cVar);
                C87412m.m108591d(str);
                cVar.onMoovReady(str, (long) i3, (long) i4, videoInfo);
            }
            return 1;
        }

        public int onM3U8Ready(String str, String str2) {
            return 0;
        }
    }

    /* renamed from: b72.d$b */
    public static final class C16759b {

        /* renamed from: a */
        public final String f45292a;

        /* renamed from: b */
        public final String f45293b;

        public C16759b(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "tag");
            this.f45292a = str;
            this.f45293b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16759b)) {
                return false;
            }
            C16759b bVar = (C16759b) obj;
            return C87412m.m108589b(this.f45292a, bVar.f45292a) && C87412m.m108589b(this.f45293b, bVar.f45293b);
        }

        public int hashCode() {
            return (this.f45292a.hashCode() * 31) + this.f45293b.hashCode();
        }

        public String toString() {
            return "RecordTask(mediaId=" + this.f45292a + ", tag=" + this.f45293b + ')';
        }
    }

    /* renamed from: e */
    public static final boolean m16358e(C16756d dVar, String str, List list, String str2, String str3, String str4) {
        C16759b bVar;
        dVar.getClass();
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("MMMarsTaskDistributor", str2 + " by jni " + str3 + " return for invalid mediaId:" + str);
            return false;
        } else if (!list.isEmpty()) {
            return true;
        } else {
            Iterator<C16759b> it = dVar.f45289d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (C87412m.m108589b(bVar.f45292a, str)) {
                    break;
                }
            }
            C16759b bVar2 = bVar;
            if (bVar2 == null) {
                return false;
            }
            Log.m105928w("MMMarsTaskDistributor", str2 + " by jni " + str3 + " return for not containsKey task:" + bVar2.f45293b + " msg:" + str4);
            return false;
        }
    }

    /* renamed from: a */
    public List<C16752a> mo17763a(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("MMMarsTaskDistributor", "getPreloadTaskListByMediaId failed for mediaId:NULL");
            return copyOnWriteArrayList;
        }
        CopyOnWriteArrayList<C20446a> copyOnWriteArrayList2 = this.f45287b;
        ArrayList<C20446a> arrayList = new ArrayList<>();
        for (T next : copyOnWriteArrayList2) {
            if (C87412m.m108589b(((C20446a) next).f45275g, str)) {
                arrayList.add(next);
            }
        }
        for (C20446a add : arrayList) {
            copyOnWriteArrayList.add(add);
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: b */
    public boolean mo17764b(C16752a aVar) {
        C87412m.m108594g(aVar, "task");
        T t = null;
        if (aVar instanceof C16867c) {
            Iterator<T> it = this.f45288c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C87412m.m108589b(((C16867c) next).f45276h, aVar.f45276h)) {
                    t = next;
                    break;
                }
            }
            if (((C16867c) t) != null) {
                Log.m105928w("MMMarsTaskDistributor", "submitTask failed for duplicated download task:" + aVar);
                return false;
            }
            List<C16752a> a = mo17763a(aVar.f45275g);
            Iterator it4 = ((CopyOnWriteArrayList) a).iterator();
            while (it4.hasNext()) {
                C24564k0.m30737a(this.f45287b).remove((C16752a) it4.next());
            }
            if (!a.isEmpty()) {
                Log.m105928w("MMMarsTaskDistributor", "submitTask remove same preload task:" + aVar + " list:" + a);
            }
            this.f45288c.add(aVar);
            mo17769f(aVar.f45276h, aVar);
            Log.m105928w("MMMarsTaskDistributor", "submitTask success for download task:" + aVar + " size:" + this.f45288c.size() + " downloading:[" + this.f45288c + ']');
        } else if (aVar instanceof C20446a) {
            Iterator<T> it5 = this.f45287b.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                T next2 = it5.next();
                if (C87412m.m108589b(((C20446a) next2).f45275g, aVar.f45275g)) {
                    t = next2;
                    break;
                }
            }
            if (((C20446a) t) != null) {
                Log.m105928w("MMMarsTaskDistributor", "submitTask failed for duplicated preload task:" + aVar);
                return false;
            }
            List<C16752a> c = mo17765c(aVar.f45275g);
            if (!c.isEmpty()) {
                Log.m105928w("MMMarsTaskDistributor", "submitTask failed for is downloading task:" + aVar + " list:" + c);
                return false;
            }
            this.f45287b.add(aVar);
            mo17769f(aVar.f45276h, aVar);
            Log.m105928w("MMMarsTaskDistributor", "submitTask success for preload task:" + aVar + " size:" + this.f45287b.size() + " preloading:[" + this.f45287b + ']');
        } else {
            Log.m105928w("MMMarsTaskDistributor", "submitTask failed for unknown task:" + aVar);
        }
        return true;
    }

    /* renamed from: c */
    public List<C16752a> mo17765c(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("MMMarsTaskDistributor", "getDownloadTaskListByMediaId failed for mediaId:NULL");
            return copyOnWriteArrayList;
        }
        CopyOnWriteArrayList<C16867c> copyOnWriteArrayList2 = this.f45288c;
        ArrayList<C16867c> arrayList = new ArrayList<>();
        for (T next : copyOnWriteArrayList2) {
            if (C87412m.m108589b(((C16867c) next).f45275g, str)) {
                arrayList.add(next);
            }
        }
        for (C16867c add : arrayList) {
            copyOnWriteArrayList.add(add);
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: d */
    public boolean mo17766d(C16752a aVar) {
        C87412m.m108594g(aVar, "task");
        T t = null;
        if (aVar instanceof C20446a) {
            Iterator<T> it = this.f45287b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C87412m.m108589b(((C20446a) next).f45276h, aVar.f45276h)) {
                    t = next;
                    break;
                }
            }
            C20446a aVar2 = (C20446a) t;
            if (aVar2 == null) {
                Log.m105928w("MMMarsTaskDistributor", "cancelTask failed for null preload taskId:" + aVar.f45276h + " task:" + aVar);
                return false;
            }
            this.f45287b.remove(aVar2);
            Log.m105924i("MMMarsTaskDistributor", "cancelTask success for preload task:" + aVar);
            return true;
        } else if (aVar instanceof C16867c) {
            Iterator<T> it4 = this.f45288c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next2 = it4.next();
                if (C87412m.m108589b(((C16867c) next2).f45276h, aVar.f45276h)) {
                    t = next2;
                    break;
                }
            }
            if (((C16867c) t) == null) {
                Log.m105928w("MMMarsTaskDistributor", "cancelTask failed for null download taskId:" + aVar.f45276h + " task:" + aVar);
                return false;
            }
            this.f45288c.remove(aVar);
            Log.m105924i("MMMarsTaskDistributor", "cancelTask success for download task:" + aVar);
            return true;
        } else {
            Log.m105928w("MMMarsTaskDistributor", "cancelTask failed for unknown task:" + aVar);
            return true;
        }
    }

    /* renamed from: f */
    public final void mo17769f(String str, C16752a aVar) {
        if (this.f45289d.size() > 200) {
            this.f45289d.remove(0);
        }
        this.f45289d.add(new C16759b(str, aVar.toString()));
    }
}
