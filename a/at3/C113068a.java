package at3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.SparseArray;
import bt3.C113206a;
import bt3.C113210e;
import bt3.C113211f;
import bt3.C113212g;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p156gj.C87203t;

/* renamed from: at3.a */
public class C113068a {

    /* renamed from: a */
    public static final int[] f338454a = {1, 4, 9, 2};

    /* renamed from: b */
    public static int f338455b = -1;

    /* renamed from: a */
    public static C113206a m154742a(int i, int i2, Context context, int i3, SparseArray<C113077g> sparseArray, List<C79631i> list) {
        int i4;
        int i5;
        C113206a aVar = new C113206a();
        aVar.f338716d = 0;
        String str = "";
        aVar.f338717e = str;
        char c = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            String str2 = packageInfo.versionName;
            i4 = packageInfo.versionCode;
        } catch (Throwable unused) {
            i4 = 0;
        }
        aVar.f338719g = i4;
        aVar.f338720h = "14D6ACDE3C2F2F48";
        aVar.f338721i = 500000;
        aVar.f338722j = i3;
        String packageName = context.getPackageName();
        if (packageName == null) {
            packageName = str;
        }
        aVar.f338723n = packageName;
        ArrayList<C113212g> arrayList = new ArrayList<>();
        int i6 = 0;
        while (i6 < sparseArray.size()) {
            C113077g valueAt = sparseArray.valueAt(i6);
            valueAt.getClass();
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            while (true) {
                Object[] objArr = valueAt.f338476b;
                if (i7 >= objArr.length) {
                    break;
                }
                List list2 = (List) objArr[i7];
                if (list2 == null || list2.size() == 0) {
                    List<C79631i> list3 = list;
                } else {
                    C113212g gVar = new C113212g();
                    ArrayList arrayList3 = new ArrayList();
                    List list4 = (List) valueAt.f338476b[i7];
                    if (list4 != null) {
                        int i8 = 0;
                        while (i8 < list4.size()) {
                            C113078h hVar = (C113078h) list4.get(i8);
                            C113211f fVar = new C113211f();
                            float[] fArr = hVar.f338482c;
                            fVar.f338749e = fArr[c];
                            fVar.f338750f = fArr[1];
                            fVar.f338751g = fArr[2];
                            fVar.f338748d = hVar.f338481b;
                            arrayList3.add(fVar);
                            i8++;
                            SparseArray<C113077g> sparseArray2 = sparseArray;
                            list4 = list4;
                            c = 0;
                        }
                    }
                    HashMap hashMap = new HashMap();
                    int i9 = valueAt.f338475a;
                    hashMap.put(Integer.valueOf(i9 == 1 ? 0 : i9 == 4 ? 2 : i9 == 9 ? 4 : -1), arrayList3);
                    gVar.f338754e = hashMap;
                    C113078h hVar2 = (C113078h) list2.get(0);
                    if (hVar2 == null) {
                        List<C79631i> list5 = list;
                    } else {
                        gVar.f338753d = hVar2.f338481b;
                        if (list.size() > i7) {
                            C79631i iVar = list.get(i7);
                            if (iVar != null) {
                                gVar.f338755f = iVar.f233505a;
                                gVar.f338756g = 0;
                                gVar.f338757h = iVar.f233506b;
                                gVar.f338758i = iVar.f233507c;
                            }
                        } else {
                            List<C79631i> list6 = list;
                        }
                        arrayList2.add(gVar);
                    }
                }
                i7++;
                SparseArray<C113077g> sparseArray3 = sparseArray;
                c = 0;
            }
            List<C79631i> list7 = list;
            arrayList.addAll(arrayList2);
            i6++;
            c = 0;
        }
        if (arrayList.size() <= 0 || arrayList.get(0) == null) {
            throw new IllegalArgumentException("invalid stateUnits");
        }
        C113210e eVar = new C113210e();
        eVar.f338742d = arrayList.get(0).f338753d;
        eVar.f338743e = arrayList;
        eVar.f338744f = i;
        eVar.f338745g = i2;
        ArrayList<C113210e> arrayList4 = new ArrayList<>();
        arrayList4.add(eVar);
        aVar.f338718f = arrayList4;
        aVar.f338724o = "1234567890ABCDEF";
        aVar.f338725p = str;
        String str3 = Build.BRAND;
        if (str3 == null) {
            str3 = str;
        }
        aVar.f338726q = str3;
        String k = C87203t.m108275k();
        if (k == null) {
            k = str;
        }
        aVar.f338727r = k;
        String str4 = Build.FINGERPRINT;
        if (str4 != null) {
            str = str4;
        }
        aVar.f338728s = str;
        if (f338455b == -1) {
            SensorManager sensorManager = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            if (sensorManager == null) {
                i5 = f338455b;
                aVar.f338729t = i5;
                aVar.f338730u = Build.VERSION.SDK_INT;
                aVar.f338732w = 2;
                return aVar;
            }
            int i15 = 0;
            int i16 = 1;
            while (true) {
                int[] iArr = f338454a;
                if (i15 >= 4) {
                    break;
                }
                i16 |= (sensorManager.getDefaultSensor(iArr[i15]) == null ? 0 : 1) << i15;
                i15++;
            }
            f338455b = i16;
        }
        i5 = f338455b;
        aVar.f338729t = i5;
        aVar.f338730u = Build.VERSION.SDK_INT;
        aVar.f338732w = 2;
        return aVar;
    }
}
