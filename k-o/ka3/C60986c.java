package ka3;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.WeOcr;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ja3.C60786a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import m20.C61433b;
import my3.C61595o;
import sx3.C36904l0;

@C86522b
/* renamed from: ka3.c */
public final class C60986c extends C86301e implements C61433b {

    /* renamed from: d */
    public static C60786a f173693d;

    /* renamed from: G9 */
    public ArrayList<String> mo85963G9(ArrayList<String> arrayList) {
        boolean z;
        String a;
        C87412m.m108594g(arrayList, "imagePathList");
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (f173693d != null) {
            z = true;
        } else {
            C60786a aVar = new C60786a();
            f173693d = aVar;
            z = aVar.mo85719b();
            Log.m105924i("MicroMsg.OcrApiImpl", "initEnv >> " + z);
        }
        if (!z) {
            return arrayList2;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            Bitmap bitmap = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Log.m105924i("MicroMsg.OcrApiImpl", "getImageOcrResult >> " + str);
            C60985a vx02 = vx0(str);
            Buffer buffer = vx02 != null ? vx02.f173692b : null;
            if (vx02 != null) {
                bitmap = vx02.f173691a;
            }
            String str2 = "";
            if (buffer == null || bitmap == null) {
                Log.m105920e("MicroMsg.OcrApiImpl", "getImageOcrResult >> buffer get error");
                arrayList2.add(str2);
            } else {
                C60786a aVar2 = f173693d;
                if (!(aVar2 == null || (a = aVar2.mo85718a(buffer, bitmap.getWidth(), bitmap.getHeight())) == null)) {
                    str2 = a;
                }
                Log.m105918d("MicroMsg.OcrApiImpl", "getImageOcrResult >> result: " + str2);
                arrayList2.add(str2);
            }
        }
        Log.m105924i("MicroMsg.OcrApiImpl", "destroyEnv");
        C60786a aVar3 = f173693d;
        if (aVar3 != null) {
            Log.m105924i("MicroMsg.WeChatClsManager", "destroyOcrEnv");
            WeOcr.nRelease(aVar3.f173136d);
            aVar3.f173136d = 0;
        }
        f173693d = null;
        return arrayList2;
    }

    public ArrayList<String> ki0(ArrayList<String> arrayList) {
        C87412m.m108594g(arrayList, "imagePathList");
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (f173693d == null) {
            f173693d = new C60786a();
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            Bitmap bitmap = null;
            if (it.hasNext()) {
                String str = (String) it.next();
                Log.m105924i("MicroMsg.OcrApiImpl", "getImageHash >> " + str);
                C60985a vx02 = vx0(str);
                Buffer buffer = vx02 != null ? vx02.f173692b : null;
                if (vx02 != null) {
                    bitmap = vx02.f173691a;
                }
                String str2 = "";
                if (buffer == null || bitmap == null) {
                    Log.m105920e("MicroMsg.OcrApiImpl", "getImageHash >> buffer get error");
                    arrayList2.add(str2);
                } else {
                    if (f173693d != null) {
                        str2 = WeOcr.nGetImageHash(buffer, bitmap.getHeight(), bitmap.getWidth());
                        Log.m105924i("MicroMsg.WeChatClsManager", "getImageOcrHash >> result: " + str2);
                        C87412m.m108593f(str2, "result");
                    }
                    arrayList2.add(str2);
                    Log.m105924i("MicroMsg.OcrApiImpl", "getImageHash >> " + str2);
                }
            } else {
                f173693d = null;
                return arrayList2;
            }
        }
    }

    public final C60985a vx0(String str) {
        C87412m.m108594g(str, "imagePath");
        Log.m105924i("MicroMsg.OcrApiImpl", "getBufferImageData >> " + str);
        if (!C86013q1.m106450k(str)) {
            Log.m105924i("MicroMsg.OcrApiImpl", "file is no exists");
            return null;
        }
        Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(str, 960, 960, true);
        if (decodeFileWithSample == null) {
            Log.m105924i("MicroMsg.OcrApiImpl", "bitmap is null");
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(decodeFileWithSample.getByteCount());
        decodeFileWithSample.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i = length * 3;
        byte[] bArr = new byte[i];
        Iterator it = C61595o.m72301i(0, length).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            int i2 = a * 3;
            int i3 = a * 4;
            bArr[i2] = array[i3];
            bArr[i2 + 1] = array[i3 + 1];
            bArr[i2 + 2] = array[i3 + 2];
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.put(bArr);
        return new C60985a(decodeFileWithSample, allocateDirect);
    }
}
