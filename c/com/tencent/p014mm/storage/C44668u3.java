package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IStorageEx;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import java.util.List;
import p261wl.C15510f;

/* renamed from: com.tencent.mm.storage.u3 */
public interface C44668u3 extends IStorageEx {

    /* renamed from: com.tencent.mm.storage.u3$c */
    public interface C30780c extends C15510f {
        void onNotifyChange(int i, MStorageEx mStorageEx, Object obj);
    }

    /* renamed from: com.tencent.mm.storage.u3$a */
    public interface C44669a {
        /* renamed from: J1 */
        void mo69732J1(C44668u3 u3Var, C72996z1 z1Var);

        /* renamed from: K4 */
        int mo69733K4(C72996z1 z1Var, boolean z);

        C72996z1 get(String str);
    }

    /* renamed from: com.tencent.mm.storage.u3$b */
    public interface C44670b extends C15510f {
        /* renamed from: J1 */
        void mo433J1(C44668u3 u3Var, C72996z1 z1Var);

        /* renamed from: K4 */
        int mo434K4(C72996z1 z1Var, boolean z);

        C72996z1 get(String str);
    }

    /* renamed from: A3 */
    Cursor mo69648A3(int i, boolean z);

    /* renamed from: B3 */
    String mo69649B3(String str, String str2, List<String> list);

    /* renamed from: C3 */
    Cursor mo69650C3(List<String> list, boolean z);

    /* renamed from: D3 */
    Cursor mo69651D3(String str, String str2, List<String> list, List<String> list2, boolean z, boolean z2);

    /* renamed from: E3 */
    Cursor mo69652E3(List<String> list);

    /* renamed from: F1 */
    void mo69653F1(String str);

    /* renamed from: F3 */
    Cursor mo69654F3(List<String> list);

    /* renamed from: G3 */
    String mo69655G3();

    /* renamed from: H3 */
    C72996z1 mo69656H3(String str);

    /* renamed from: I3 */
    Cursor mo69657I3(List<String> list, String str, List<String> list2);

    /* renamed from: J3 */
    Cursor mo69659J3();

    /* renamed from: K3 */
    boolean mo69661K3(String str);

    /* renamed from: L3 */
    String mo69662L3(String str);

    /* renamed from: M3 */
    Cursor mo69663M3(List<String> list);

    /* renamed from: N2 */
    C72996z1 mo69664N2(String str);

    /* renamed from: N3 */
    Cursor mo69665N3();

    /* renamed from: O3 */
    void mo69666O3(C44669a aVar);

    /* renamed from: P3 */
    boolean mo69667P3(C72996z1 z1Var);

    /* renamed from: Q3 */
    boolean mo69668Q3(C72996z1 z1Var);

    /* renamed from: R3 */
    int mo69669R3();

    /* renamed from: S3 */
    Cursor mo69670S3(String[] strArr, String str, String str2, String str3, List<String> list);

    /* renamed from: T3 */
    int mo69671T3(String str, String str2, List<String> list);

    /* renamed from: U3 */
    int[] mo69672U3(String[] strArr, String str, String str2, String str3, List<String> list);

    /* renamed from: V3 */
    String mo69673V3();

    /* renamed from: W2 */
    C72996z1 mo69674W2(String str);

    /* renamed from: W3 */
    int[] mo69675W3(List<String> list);

    /* renamed from: X2 */
    int mo69676X2(String str, String str2);

    /* renamed from: X3 */
    List<String> mo69677X3(List<String> list);

    /* renamed from: Y2 */
    int mo69678Y2(String str, C72996z1 z1Var);

    /* renamed from: Y3 */
    Cursor mo69679Y3(String[] strArr, String str, String str2, List<String> list);

    /* renamed from: Z2 */
    List<String> mo69680Z2();

    /* renamed from: Z3 */
    Cursor mo69681Z3();

    /* renamed from: a3 */
    Cursor mo69683a3();

    /* renamed from: a4 */
    Cursor mo69684a4(List<String> list, int i, boolean z);

    /* renamed from: b3 */
    Cursor mo69686b3(List<String> list, String str, List<String> list2);

    /* renamed from: b4 */
    Cursor mo69687b4(String str, String str2, List<String> list);

    /* renamed from: c */
    int mo69688c(String str);

    /* renamed from: c3 */
    Cursor mo69689c3(List<String> list, String str, List<String> list2);

    /* renamed from: c4 */
    void mo69690c4(C72996z1 z1Var);

    /* renamed from: d3 */
    int[] mo69691d3(List<String> list);

    /* renamed from: d4 */
    Cursor mo69692d4(List<String> list);

    /* renamed from: e3 */
    Cursor mo69693e3(String str);

    /* renamed from: e4 */
    C72996z1 mo69694e4(long j);

    /* renamed from: f3 */
    C72996z1 mo69696f3(String str);

    /* renamed from: f4 */
    byte[] mo69697f4(String str);

    /* renamed from: g3 */
    int mo69698g3(String str, long j);

    /* renamed from: g4 */
    Cursor mo69699g4(List<String> list, boolean z);

    C72996z1 get(String str);

    /* renamed from: h3 */
    void mo69701h3(C44669a aVar);

    /* renamed from: h4 */
    Cursor mo69702h4(List<String> list);

    /* renamed from: i3 */
    boolean mo69704i3(C72996z1 z1Var);

    /* renamed from: i4 */
    Cursor mo69705i4(String str, String str2, List<String> list, boolean z);

    /* renamed from: j3 */
    int mo69707j3(C72996z1 z1Var);

    /* renamed from: j4 */
    Cursor mo69708j4(List<String> list, boolean z);

    /* renamed from: k3 */
    boolean mo69709k3(String str);

    /* renamed from: k4 */
    Cursor mo69710k4();

    /* renamed from: l3 */
    int mo69711l3(String[] strArr, String... strArr2);

    /* renamed from: l4 */
    Cursor mo69712l4(String[] strArr, String str, String str2, List<String> list, List<String> list2);

    /* renamed from: m3 */
    String mo69713m3(String str);

    /* renamed from: m4 */
    Cursor mo69714m4();

    /* renamed from: n3 */
    long mo69715n3(String str);

    /* renamed from: n4 */
    int mo69716n4(String str, byte[] bArr);

    /* renamed from: o3 */
    String mo69717o3(List<String> list, boolean z);

    /* renamed from: o4 */
    int mo69718o4(String str);

    /* renamed from: p3 */
    int mo69719p3(String str, C72996z1 z1Var);

    /* renamed from: p4 */
    int mo69720p4();

    /* renamed from: q3 */
    Cursor mo69721q3(String str, String str2, List<String> list, List<String> list2, boolean z, boolean z2);

    /* renamed from: q4 */
    List<String> mo69722q4();

    /* renamed from: r3 */
    int[] mo69723r3(String[] strArr, String str, String str2, String str3, List<String> list);

    /* renamed from: s3 */
    boolean mo69724s3(String str);

    /* renamed from: t3 */
    Cursor mo69725t3(String str, String str2, List<String> list, boolean z, boolean z2);

    /* renamed from: u3 */
    void mo69726u3(C72996z1 z1Var, boolean z);

    /* renamed from: v3 */
    Cursor mo69727v3(String str, String str2, List<String> list, List<String> list2, boolean z, boolean z2);

    /* renamed from: w3 */
    Cursor mo69728w3();

    /* renamed from: x3 */
    int mo69729x3(String[] strArr, String... strArr2);

    /* renamed from: y3 */
    C72996z1 mo69730y3(String str);

    /* renamed from: z3 */
    Cursor mo69731z3(List<String> list);
}
