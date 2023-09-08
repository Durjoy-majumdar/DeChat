package he0;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import di3.C7335d;
import ob0.C117747y;

/* renamed from: he0.j */
public interface C76158j extends C7335d {

    /* renamed from: he0.j$a */
    public enum C8510a {
        TYPE_WORDING,
        TYPE_URL
    }

    SpannableString D30(Context context, String str, String str2, int i);

    CharSequence De0(Context context, String str, String str2, float f);

    /* renamed from: LW */
    void mo106359LW(Context context, TextView textView, CharSequence charSequence, String str, String str2, int i);

    Bitmap Lk0(String str);

    void Mg0(String str, String str2, int i);

    String Rn0(String str, String str2, C8510a aVar);

    String S10(String str, String str2, C8510a aVar, int i);

    /* renamed from: Xg */
    void mo106364Xg();

    int b10(String str, int i);

    CharSequence bm0(Context context, CharSequence charSequence);

    /* renamed from: cY */
    TextAppearanceSpan mo106367cY(Context context, String str, int i, int i2);

    /* renamed from: lU */
    void mo106368lU(Context context, TextView textView, CharSequence charSequence);

    /* renamed from: nc */
    String mo106369nc(String str, String str2, C8510a aVar);

    void onSceneEnd(int i, int i2, String str, C117747y yVar);

    /* renamed from: tU */
    void mo106371tU(String str, String str2, String str3);

    /* renamed from: vO */
    void mo106372vO(String str, String str2, String str3);

    /* renamed from: wo */
    String mo106373wo(String str, String str2);

    void ym0(String str, String str2);
}
