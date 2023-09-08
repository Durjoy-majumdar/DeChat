package c40;

import a40.C79462a;
import com.tencent.p014mm.sdk.platformtools.Log;
import d40.C86172c;
import f30.C86705b;
import java.lang.reflect.Array;
import java.util.HashMap;
import org.tensorflow.lite.C89289c;
import y30.C91370a;

/* renamed from: c40.b */
public class C79929b extends C79928a {

    /* renamed from: c40.b$a */
    public class C79930a extends C79462a.C79464b {
        public C79930a() {
            super(C79929b.this);
        }

        /* renamed from: a */
        public C79462a.C79463a mo109461a(C89289c cVar, Object[] objArr) {
            HashMap hashMap = new HashMap();
            float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, new int[]{1, 1});
            hashMap.put(0, fArr);
            cVar.mo123629e(objArr, hashMap);
            C79462a.C79463a aVar = new C79462a.C79463a(C79929b.this);
            aVar.mo109460b(1, fArr[0][0]);
            if (((double) fArr[0][0]) > 0.5d) {
                C86172c.m106685a(31);
            } else {
                C86172c.m106685a(32);
            }
            return aVar;
        }
    }

    /* renamed from: c40.b$b */
    public class C79931b extends C79462a.C79464b {
        public C79931b() {
            super(C79929b.this);
        }

        /* renamed from: a */
        public C79462a.C79463a mo109461a(C89289c cVar, Object[] objArr) {
            HashMap hashMap = new HashMap();
            float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, new int[]{1, 2});
            hashMap.put(0, fArr);
            cVar.mo123629e(objArr, hashMap);
            C79462a.C79463a aVar = new C79462a.C79463a(C79929b.this);
            aVar.mo109460b(0, fArr[0][0]);
            aVar.mo109460b(1, fArr[0][1]);
            if (((double) fArr[0][1]) > 0.5d) {
                C86172c.m106685a(34);
            } else {
                C86172c.m106685a(35);
            }
            return aVar;
        }
    }

    public C79929b(C91370a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    public C79462a.C79463a mo109457c(C86705b bVar) {
        boolean z;
        C79462a.C79464b bVar2;
        Object[] b = bVar.mo121091b(this.f234151b);
        C89289c cVar = this.f234151b;
        if (cVar == null) {
            Log.m105920e("Kara.BinaryClassifyPredict", "tflite null, not allowed");
            return null;
        }
        if (cVar != null && b != null && cVar.mo123626c() == b.length) {
            int i = 0;
            while (true) {
                if (i >= this.f234151b.mo123626c()) {
                    z = true;
                    break;
                }
                if (this.f234151b.mo123625b(i).mo123618i() != ((float[][]) b[i])[0].length) {
                    break;
                }
                i++;
            }
        }
        z = false;
        if (!z) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(b == null ? 0 : b.length);
            objArr[1] = Integer.valueOf(this.f234151b.mo123626c());
            Log.m105921e("Kara.BinaryClassifyPredict", "input size not match!!![%d %d]", objArr);
            return null;
        }
        C89289c cVar2 = this.f234151b;
        int i2 = cVar2 == null ? 0 : cVar2.mo123628d(0).mo123618i();
        if (i2 == 1) {
            C86172c.m106685a(30);
            bVar2 = new C79930a();
        } else if (i2 != 2) {
            bVar2 = null;
        } else {
            C86172c.m106685a(33);
            bVar2 = new C79931b();
        }
        if (bVar2 == null) {
            Log.m105921e("Kara.BinaryClassifyPredict", "pridict output not match! %d", Integer.valueOf(this.f234151b.mo123628d(0).mo123618i()));
            return null;
        }
        C86172c.m106685a(29);
        C79462a.C79463a a = bVar2.mo109461a(this.f234151b, b);
        if (((double) a.mo109459a(1)) > 0.5d) {
            C86172c.m106685a(22);
        } else {
            C86172c.m106685a(23);
        }
        return a;
    }
}
