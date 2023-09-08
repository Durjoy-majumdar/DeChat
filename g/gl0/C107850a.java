package gl0;

import android.graphics.RectF;
import com.tencent.p014mm.xeffect.FaceTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import qr3.C110464a;

/* renamed from: gl0.a */
public class C107850a {

    /* renamed from: d */
    public static C107850a f322941d;

    /* renamed from: a */
    public FaceTracker f322942a;

    /* renamed from: b */
    public ExecutorService f322943b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public ArrayList<HashMap<String, Object>> f322944c = new ArrayList<>();

    /* renamed from: gl0.a$a */
    public class C107851a {

        /* renamed from: a */
        public float f322945a = 0.0f;

        /* renamed from: b */
        public float f322946b = 0.0f;

        /* renamed from: c */
        public float f322947c = 0.0f;

        public C107851a(C107850a aVar, C110464a aVar2) {
            this.f322945a = aVar2.f330333a;
            this.f322946b = aVar2.f330335c;
            this.f322947c = aVar2.f330334b;
        }
    }

    /* renamed from: gl0.a$b */
    public class C107852b {

        /* renamed from: a */
        public float f322948a = 0.0f;

        /* renamed from: b */
        public float f322949b = 0.0f;

        /* renamed from: c */
        public float f322950c = 0.0f;

        /* renamed from: d */
        public float f322951d = 0.0f;

        /* renamed from: e */
        public float f322952e = 0.0f;

        public C107852b(C107850a aVar, float[] fArr) {
            if (fArr != null && fArr.length == 5) {
                this.f322948a = fArr[0];
                this.f322949b = fArr[1];
                this.f322950c = fArr[2];
                this.f322951d = fArr[3];
                this.f322952e = fArr[4];
            }
        }
    }

    /* renamed from: gl0.a$c */
    public enum C107853c {
        ResultOK,
        ResultNotInit,
        ResultInited,
        ResultInitFail,
        ResultFaceDetectedFail,
        ResultStopFail
    }

    /* renamed from: gl0.a$e */
    public class C107855e {

        /* renamed from: a */
        public float f322964a;

        /* renamed from: b */
        public float f322965b;

        /* renamed from: c */
        public ArrayList<HashMap<String, Float>> f322966c;

        /* renamed from: d */
        public C107854d f322967d;

        /* renamed from: e */
        public C107852b f322968e;

        /* renamed from: f */
        public C107851a f322969f;

        public C107855e(C107850a aVar, float f, float f2, C107854d dVar, ArrayList<HashMap<String, Float>> arrayList, C107852b bVar, C107851a aVar2) {
            this.f322964a = f;
            this.f322965b = f2;
            this.f322966c = arrayList;
            this.f322967d = dVar;
            this.f322968e = bVar;
            this.f322969f = aVar2;
        }

        /* renamed from: a */
        public HashMap<String, Object> mo158271a() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("x", Float.valueOf(this.f322964a));
            hashMap.put("y", Float.valueOf(this.f322965b));
            C107854d dVar = this.f322967d;
            if (dVar != null) {
                dVar.getClass();
                HashMap hashMap2 = new HashMap(4);
                hashMap2.put("originX", Float.valueOf(dVar.f322960a));
                hashMap2.put("originY", Float.valueOf(dVar.f322961b));
                hashMap2.put("width", Float.valueOf(dVar.f322962c));
                hashMap2.put("height", Float.valueOf(dVar.f322963d));
                hashMap.put("detectRect", hashMap2);
            }
            ArrayList<HashMap<String, Float>> arrayList = this.f322966c;
            if (arrayList != null) {
                hashMap.put("pointArray", arrayList);
            }
            C107852b bVar = this.f322968e;
            if (bVar != null) {
                bVar.getClass();
                HashMap hashMap3 = new HashMap(5);
                hashMap3.put("global", Float.valueOf(bVar.f322948a));
                hashMap3.put("leftEye", Float.valueOf(bVar.f322949b));
                hashMap3.put("rightEye", Float.valueOf(bVar.f322950c));
                hashMap3.put("mouth", Float.valueOf(bVar.f322951d));
                hashMap3.put("nose", Float.valueOf(bVar.f322952e));
                hashMap.put("confArray", hashMap3);
            }
            C107851a aVar = this.f322969f;
            if (aVar != null) {
                aVar.getClass();
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("pitch", Float.valueOf(aVar.f322945a));
                hashMap4.put("roll", Float.valueOf(aVar.f322946b));
                hashMap4.put("yaw", Float.valueOf(aVar.f322947c));
                hashMap.put("angleArray", hashMap4);
            }
            return hashMap;
        }
    }

    /* renamed from: b */
    public static synchronized C107850a m146130b() {
        C107850a aVar;
        synchronized (C107850a.class) {
            if (f322941d == null) {
                f322941d = new C107850a();
            }
            aVar = f322941d;
        }
        return aVar;
    }

    /* renamed from: a */
    public int mo158270a(C107853c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: gl0.a$d */
    public class C107854d {

        /* renamed from: a */
        public float f322960a;

        /* renamed from: b */
        public float f322961b;

        /* renamed from: c */
        public float f322962c;

        /* renamed from: d */
        public float f322963d;

        public C107854d(C107850a aVar, RectF rectF) {
            this.f322960a = rectF.centerX() - (rectF.width() / 2.0f);
            this.f322961b = rectF.centerY() - (rectF.height() / 2.0f);
            this.f322962c = rectF.width();
            this.f322963d = rectF.height();
        }

        public C107854d(C107850a aVar, float f, float f2, float f3, float f4) {
            this.f322960a = f;
            this.f322961b = f2;
            this.f322962c = f3;
            this.f322963d = f4;
        }
    }
}
