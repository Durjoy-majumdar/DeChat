package gf0;

import cf0.C80028g;
import cf0.C80030i;
import com.tencent.p014mm.mm7zip.IOutCreateCallback;
import com.tencent.p014mm.mm7zip.IOutItemBase;
import com.tencent.p014mm.mm7zip.IOutItemZip;
import com.tencent.p014mm.mm7zip.ISequentialInStream;
import com.tencent.p014mm.mm7zip.impl.OutItemFactory;
import com.tencent.stubs.logger.Log;
import gf0.C87178a;
import java.io.File;

/* renamed from: gf0.f */
public class C87184f implements IOutCreateCallback<IOutItemBase>, C87178a.C87179a {

    /* renamed from: c */
    public static int f252843c = 0;

    /* renamed from: d */
    public static int f252844d = -1;

    /* renamed from: a */
    public C87180c[] f252845a;

    /* renamed from: b */
    public String f252846b;

    public C87184f(C87180c[] cVarArr, String str) {
        this.f252845a = cVarArr;
        this.f252846b = str;
        int length = cVarArr.length / 4;
        f252844d = length;
        if (length < 4) {
            f252844d = 4;
        }
    }

    /* renamed from: a */
    public void mo121627a() {
        int i = 0;
        while (true) {
            try {
                C87180c[] cVarArr = this.f252845a;
                if (i < cVarArr.length) {
                    C87180c cVar = cVarArr[i];
                    if (cVar != null) {
                        try {
                            C87178a aVar = cVar.f252835b;
                            if (aVar != null) {
                                aVar.getClass();
                                this.f252845a[i].f252835b = null;
                                Log.m106493d("Zip7MMMergeCallBack", "destory, clear.");
                            }
                        } catch (Exception e) {
                            Log.m106505i("Zip7MMMergeCallBack", "Zip7DiffCallBack, remove byteArrayStream = " + e);
                        }
                        try {
                            C80028g gVar = this.f252845a[i].f252836c;
                            if (gVar != null) {
                                gVar.close();
                                this.f252845a[i].f252836c = null;
                                Log.m106493d("Zip7MMMergeCallBack", "destory, clear.");
                            }
                        } catch (Exception e2) {
                            Log.m106505i("Zip7MMMergeCallBack", "Zip7DiffCallBack, remove byteArrayStream = " + e2);
                        }
                        this.f252845a[i].getClass();
                        this.f252845a[i] = null;
                    }
                    i++;
                } else {
                    Runtime.getRuntime().gc();
                    return;
                }
            } catch (Exception e3) {
                Log.m106505i("Zip7MMMergeCallBack", "Zip7DiffCallBack, destory destory = " + e3);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo121628b(int i, String str) {
        Log.m106505i("Zip7MMMergeCallBack", "clearData = " + i);
        try {
            C87180c cVar = this.f252845a[i];
            if (cVar.f252835b != null) {
                cVar.f252835b = null;
                Log.m106493d("Zip7MMMergeCallBack", "clear data.");
            }
            this.f252845a[i].getClass();
            this.f252845a[i] = null;
        } catch (Exception e) {
            Log.m106505i("Zip7MMMergeCallBack", "Zip7DiffCallBack, clearData byteArrayStream = " + e);
        }
        int i2 = f252843c + 1;
        f252843c = i2;
        int i3 = f252844d;
        if (i3 > 0 && i2 % i3 == 0) {
            Log.m106505i("Zip7MMMergeCallBack", "finishTask, finistask = " + f252843c + ", filePath = " + str + ", MAX_GC_TIME = " + f252844d);
            Runtime.getRuntime().gc();
            Log.m106505i("Zip7MMMergeCallBack", "finishTask, finistask = " + f252843c + ", filePath = " + str + ", MAX_GC_TIME = " + f252844d);
        }
    }

    public IOutItemBase getItemInformation(int i, OutItemFactory<IOutItemBase> outItemFactory) {
        IOutItemBase createOutItem = outItemFactory.createOutItem();
        createOutItem.setDataSize(Long.valueOf(this.f252845a[i].f252837d.f234465e));
        ((IOutItemZip) createOutItem).setPropertyPath(this.f252845a[i].f252834a);
        return createOutItem;
    }

    public ISequentialInStream getStream(int i) {
        C80028g gVar;
        C80028g gVar2 = null;
        try {
            C80028g gVar3 = new C80028g(new File(this.f252846b));
            try {
                this.f252845a[i].f252836c = gVar3;
                gVar = gVar3;
            } catch (Exception unused) {
                gVar2 = gVar3;
                gVar = gVar2;
                C87180c cVar = this.f252845a[i];
                String str = this.f252846b;
                C80030i<Void> iVar = cVar.f252837d;
                cVar.f252835b = new C87178a(str, (int) iVar.f234464d, (int) iVar.f234465e, gVar, this, i);
                C87180c cVar2 = this.f252845a[i];
                C87178a aVar = cVar2.f252835b;
                aVar.f252828o = cVar2.f252834a;
                return aVar;
            }
        } catch (Exception unused2) {
            gVar = gVar2;
            C87180c cVar3 = this.f252845a[i];
            String str2 = this.f252846b;
            C80030i<Void> iVar2 = cVar3.f252837d;
            cVar3.f252835b = new C87178a(str2, (int) iVar2.f234464d, (int) iVar2.f234465e, gVar, this, i);
            C87180c cVar22 = this.f252845a[i];
            C87178a aVar2 = cVar22.f252835b;
            aVar2.f252828o = cVar22.f252834a;
            return aVar2;
        }
        C87180c cVar32 = this.f252845a[i];
        String str22 = this.f252846b;
        C80030i<Void> iVar22 = cVar32.f252837d;
        cVar32.f252835b = new C87178a(str22, (int) iVar22.f234464d, (int) iVar22.f234465e, gVar, this, i);
        C87180c cVar222 = this.f252845a[i];
        C87178a aVar22 = cVar222.f252835b;
        aVar22.f252828o = cVar222.f252834a;
        return aVar22;
    }

    public void setCompleted(long j) {
    }

    public void setOperationResult(boolean z) {
    }

    public void setTotal(long j) {
    }
}
