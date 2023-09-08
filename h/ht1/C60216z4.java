package ht1;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import jp3.C9486a;
import jp3.C9487b;
import ob0.C89132b;
import org.json.JSONObject;
import rx3.C13604l;
import rx3.C13605o;
import te3.C49712hj1;
import te3.C51860wo0;
import te3.C52192z0;
import te3.C64682rk1;

/* renamed from: ht1.z4 */
public interface C60216z4 {

    /* renamed from: ht1.z4$a */
    public interface C8821a<T> {
        /* renamed from: a */
        void mo6382a(T t);
    }

    /* renamed from: B5 */
    void mo83755B5(ImageView imageView, String str, int i);

    /* renamed from: C5 */
    String mo83756C5(C72963f4 f4Var);

    /* renamed from: D5 */
    FinderJumpInfo mo83757D5(String str);

    /* renamed from: E5 */
    void mo83758E5(Context context, String str, int i, String str2);

    /* renamed from: F5 */
    float mo83759F5();

    /* renamed from: G5 */
    boolean mo83760G5();

    /* renamed from: H5 */
    void mo83761H5(ImageView imageView, TextView textView, C64682rk1 rk12, int i);

    /* renamed from: I5 */
    void mo83762I5(Context context, String str, String str2, int i);

    /* renamed from: J5 */
    void mo83763J5(Context context, JSONObject jSONObject, C8821a<Object> aVar, C8821a<Integer> aVar2);

    /* renamed from: K5 */
    void mo83764K5(String str, String str2, boolean z, C8821a<Void> aVar, C8821a<Integer> aVar2);

    /* renamed from: L5 */
    void mo83765L5(String str, String str2, C8821a<Boolean> aVar, C8821a<Integer> aVar2);

    /* renamed from: M5 */
    String mo83766M5();

    /* renamed from: N5 */
    boolean mo83767N5(FinderObject finderObject);

    /* renamed from: O5 */
    String mo83768O5(String str);

    /* renamed from: P5 */
    boolean mo83769P5();

    /* renamed from: Q5 */
    void mo83770Q5(Context context, String str, long j, String str2, String str3, Map<String, Object> map, C8821a<Void> aVar, C8821a<Integer> aVar2);

    /* renamed from: R5 */
    boolean mo83771R5();

    /* renamed from: S5 */
    boolean mo83772S5();

    /* renamed from: T5 */
    Intent mo83773T5(Intent intent, String str, int i);

    /* renamed from: U5 */
    void mo83774U5(String str, long j, C8821a<Boolean> aVar, C8821a<Integer> aVar2);

    /* renamed from: V5 */
    String mo83775V5();

    /* renamed from: W5 */
    void mo83776W5(Context context, Intent intent, int i, int i2);

    /* renamed from: X5 */
    void mo83777X5(ViewGroup viewGroup, int i, int i2);

    /* renamed from: Y5 */
    int mo83778Y5();

    /* renamed from: Z5 */
    C13605o<Integer, Integer, Integer> mo83779Z5(Context context, int i, int i2);

    /* renamed from: a6 */
    Object mo83781a6(String str, String str2, C9487b<C9486a> bVar, C8821a<Object> aVar, C8821a<Integer> aVar2);

    /* renamed from: b6 */
    String mo83783b6();

    /* renamed from: c6 */
    float mo83784c6();

    /* renamed from: d6 */
    boolean mo83785d6();

    /* renamed from: e6 */
    C52192z0 mo83786e6(FinderObject finderObject);

    /* renamed from: f6 */
    void mo83787f6(String str);

    /* renamed from: g6 */
    void mo83788g6(String str, int i, JSONObject jSONObject, C49712hj1 hj12);

    C89132b<C51860wo0> getMiaojianCgi(String str);

    /* renamed from: h6 */
    void mo83790h6(int i, String str, long j, String str2, String str3, String str4);

    /* renamed from: i6 */
    void mo83791i6(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6);

    /* renamed from: j6 */
    String mo83792j6(String str, String str2);

    /* renamed from: k6 */
    void mo83793k6(Context context, String str, long j, String str2, String str3, Map<String, Object> map, C8821a<Void> aVar, C8821a<Integer> aVar2);

    /* renamed from: l6 */
    void mo83794l6(Context context, String str, String str2, boolean z, int i, String str3);

    /* renamed from: m6 */
    Boolean mo83795m6(Context context, FinderJumpInfo finderJumpInfo, Integer num);

    /* renamed from: n6 */
    String mo83796n6(C72963f4 f4Var);

    /* renamed from: s2 */
    C98520u2 mo83797s2(Context context);

    /* renamed from: w4 */
    C13604l<Boolean, Object> mo83798w4(long j, String str, int i);
}
