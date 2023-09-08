package com.tencent.p014mm.plugin.scanner.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.scanner.model.C106076p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.model.r0 */
public final class C106081r0 extends C87413o implements C32227p<C106076p0.C106079c, Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C106076p0.C106077a f315838d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106081r0(C106076p0.C106077a aVar) {
        super(2);
        this.f315838d = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean z;
        C106076p0.C106079c cVar = (C106076p0.C106079c) obj;
        Bitmap bitmap = (Bitmap) obj2;
        C87412m.m108594g(cVar, "decodeInfo");
        if (cVar.f315835b == 0) {
            Iterator<T> it = this.f315838d.f315829b.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    Log.m105924i("MicroMsg.ScanGoodsResourceManager", "alvinluo checkFinish finish");
                    break;
                }
                int i = ((C106076p0.C106079c) it.next()).f315836c;
                if (i != 2) {
                    Log.m105919d("MicroMsg.ScanGoodsResourceManager", "alvinluo checkFinish not finish status: %d", Integer.valueOf(i));
                    z = false;
                    break;
                }
            }
            if (z) {
                C106076p0.C106077a aVar = this.f315838d;
                Iterator<C106076p0.C106079c> it4 = aVar.f315829b.iterator();
                while (true) {
                    String str = "ok";
                    if (!it4.hasNext()) {
                        aVar.f315830c = 0;
                        aVar.f315831d = str;
                        break;
                    }
                    int i2 = it4.next().f315835b;
                    if (i2 != 0) {
                        aVar.f315830c = i2;
                        if (i2 != 0) {
                            str = i2 == 2 ? "image not exist" : i2 == 3 ? "decode fail" : "unknown error";
                        }
                        aVar.f315831d = str;
                    }
                }
                ((C119157j) C119157j.f356862d).mo183895z(new C106080q0(this.f315838d));
            }
        }
        return C13598b0.f38549a;
    }
}
