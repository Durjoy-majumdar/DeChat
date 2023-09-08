package p176jc;

import com.tencent.ilink.auth.FaceProto;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.skyline.jni.SkylineJNI;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import lu3.C88654b;
import rx3.C13598b0;
import wi0.C53171h;
import wi0.C53172t;
import zt3.C119157j;

/* renamed from: jc.f */
public final class C87923f {

    /* renamed from: a */
    public static final C87923f f254468a = new C87923f();

    /* renamed from: b */
    public static final AtomicInteger f254469b = new AtomicInteger(FaceProto.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE);

    /* renamed from: c */
    public static final String f254470c = C53172t.m59584a(MMApplicationContext.getContext(), C53171h.m59583a());

    /* renamed from: d */
    public static int f254471d;

    /* renamed from: e */
    public static final LinkedList<Runnable> f254472e = new LinkedList<>();

    /* renamed from: f */
    public static final HashSet<String> f254473f = new HashSet<>();

    /* renamed from: g */
    public static final Object f254474g = new Object();

    /* renamed from: jc.f$a */
    public static final class C87924a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f254475d;

        /* renamed from: e */
        public final /* synthetic */ String f254476e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, String> f254477f;

        public C87924a(int i, String str, HashMap<String, String> hashMap) {
            this.f254475d = i;
            this.f254476e = str;
            this.f254477f = hashMap;
        }

        public final void run() {
            C87923f.f254468a.mo122391a(this.f254475d, this.f254476e, this.f254477f);
        }
    }

    /* renamed from: jc.f$b */
    public static final class C87925b extends C88654b {

        /* renamed from: e */
        public final /* synthetic */ CronetLogic.CronetRequestParams f254478e;

        public C87925b(CronetLogic.CronetRequestParams cronetRequestParams) {
            this.f254478e = cronetRequestParams;
        }

        public String getKey() {
            return "SkylineCronetRequest@" + this.f254478e.taskId;
        }

        public void run() {
            Runnable pollFirst;
            CronetLogic.cancelCronetTask(this.f254478e.taskId);
            Object obj = C87923f.f254474g;
            CronetLogic.CronetRequestParams cronetRequestParams = this.f254478e;
            synchronized (obj) {
                HashSet<String> hashSet = C87923f.f254473f;
                if (hashSet.contains(cronetRequestParams.taskId)) {
                    hashSet.remove(cronetRequestParams.taskId);
                    C87923f.f254471d--;
                    LinkedList<Runnable> linkedList = C87923f.f254472e;
                    if ((!linkedList.isEmpty()) && (pollFirst = linkedList.pollFirst()) != null) {
                        pollFirst.run();
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: jc.f$c */
    public static final class C87926c implements CronetLogic.CronetTaskCallback {

        /* renamed from: a */
        public final /* synthetic */ C87925b f254479a;

        /* renamed from: b */
        public final /* synthetic */ int f254480b;

        /* renamed from: c */
        public final /* synthetic */ CronetLogic.CronetRequestParams f254481c;

        public C87926c(C87925b bVar, int i, CronetLogic.CronetRequestParams cronetRequestParams) {
            this.f254479a = bVar;
            this.f254480b = i;
            this.f254481c = cronetRequestParams;
        }

        public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
        }

        public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
            return 0;
        }

        public void onCronetReceiveUploadProgress(long j, long j2) {
        }

        public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
            String[] strArr;
            String[] strArr2;
            Runnable poll;
            CronetLogic.CronetTaskResult cronetTaskResult2 = cronetTaskResult;
            C87412m.m108594g(cronetTaskResult2, "result");
            this.f254479a.mo97819a();
            String[] strArr3 = new String[0];
            String[] strArr4 = new String[0];
            CronetLogic.HeaderMap[] headerMapArr = cronetTaskResult2.headers;
            if (headerMapArr != null) {
                int length = headerMapArr.length;
                String[] strArr5 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr5[i] = "";
                }
                int length2 = cronetTaskResult2.headers.length;
                String[] strArr6 = new String[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    strArr6[i2] = "";
                }
                CronetLogic.HeaderMap[] headerMapArr2 = cronetTaskResult2.headers;
                C87412m.m108593f(headerMapArr2, "result.headers");
                int length3 = headerMapArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length3) {
                    CronetLogic.HeaderMap headerMap = headerMapArr2[i3];
                    String str3 = headerMap.key;
                    C87412m.m108593f(str3, "entry.key");
                    strArr5[i4] = str3;
                    String str4 = headerMap.value;
                    C87412m.m108593f(str4, "entry.value");
                    strArr6[i4] = str4;
                    i3++;
                    i4++;
                }
                strArr2 = strArr5;
                strArr = strArr6;
            } else {
                strArr2 = strArr3;
                strArr = strArr4;
            }
            byte[] bArr = cronetTaskResult2.data;
            SkylineJNI.notifyCronetResponse(this.f254480b, cronetTaskResult2.errorCode, cronetTaskResult2.statusCode, strArr2, strArr, bArr == null ? new byte[0] : bArr);
            Object obj = C87923f.f254474g;
            CronetLogic.CronetRequestParams cronetRequestParams = this.f254481c;
            synchronized (obj) {
                HashSet<String> hashSet = C87923f.f254473f;
                if (hashSet.contains(cronetRequestParams.taskId)) {
                    hashSet.remove(cronetRequestParams.taskId);
                    C87923f.f254471d--;
                    LinkedList<Runnable> linkedList = C87923f.f254472e;
                    if ((!linkedList.isEmpty()) && (poll = linkedList.poll()) != null) {
                        poll.run();
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        }
    }

    /* renamed from: a */
    public final void mo122391a(int i, String str, HashMap<String, String> hashMap) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(hashMap, "requestHeader");
        synchronized (f254474g) {
            int i2 = f254471d;
            if (i2 > 10) {
                f254472e.addLast(new C87924a(i, str, hashMap));
                return;
            }
            f254471d = i2 + 1;
            CronetLogic.CronetRequestParams cronetRequestParams = new CronetLogic.CronetRequestParams();
            cronetRequestParams.url = str;
            String valueOf = String.valueOf(f254469b.incrementAndGet());
            cronetRequestParams.taskId = valueOf;
            f254473f.add(valueOf);
            cronetRequestParams.followRedirect = true;
            cronetRequestParams.method = "GET";
            cronetRequestParams.useHttp2 = true;
            cronetRequestParams.useQuic = true;
            cronetRequestParams.useMemoryCache = false;
            cronetRequestParams.cachePerformance = false;
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
            hashMap.put("User-Agent", f254470c);
            cronetRequestParams.makeRequestHeader(hashMap);
            cronetRequestParams.taskType = 1;
            C87925b bVar = new C87925b(cronetRequestParams);
            C87926c cVar = new C87926c(bVar, i, cronetRequestParams);
            ((C119157j) C119157j.f356862d).mo183878i(bVar, 30000);
            CronetLogic.startCronetHttpTask(cronetRequestParams, cVar);
        }
    }
}
