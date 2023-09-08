package bs0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sx3.C36907w;
import te3.y75;

/* renamed from: bs0.o */
public final class C79797o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79796k f233857d;

    /* renamed from: e */
    public final /* synthetic */ C79798p f233858e;

    /* renamed from: f */
    public final /* synthetic */ C79800r f233859f;

    public C79797o(C79796k kVar, C79798p pVar, C79800r rVar) {
        this.f233857d = kVar;
        this.f233858e = pVar;
        this.f233859f = rVar;
    }

    public final void run() {
        String str;
        TextView textView = this.f233857d.f233854B;
        C79798p pVar = this.f233858e;
        List<y75> list = this.f233859f.f233865b;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (y75 y75 : list) {
            arrayList.add(y75.f145165e);
        }
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        pVar.getClass();
        if (strArr.length == 0) {
            str = textView.getContext().getString(C0966R.string.dv6);
        } else {
            TextPaint paint = textView.getPaint();
            int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            String string = textView.getContext().getString(C0966R.string.e1m);
            C87412m.m108593f(string, "textView.context.getStri…_auth_info_suffix_format)");
            String string2 = textView.getContext().getString(C0966R.string.dv9);
            C87412m.m108593f(string2, "textView.context.getStri…anage_auth_info_splitter)");
            int length = strArr.length;
            String str2 = null;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = str2;
                    break;
                }
                C87412m.m108593f(paint, "paint");
                StringBuilder sb = new StringBuilder();
                int length2 = strArr.length - 1;
                boolean z = length2 != i;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(strArr[i2]);
                    sb.append(string2);
                }
                sb.append(strArr[i]);
                if (z) {
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(length2 - i)}, 1));
                    C87412m.m108593f(format, "format(this, *args)");
                    sb.append(format);
                }
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
                String str3 = sb4;
                int i3 = i;
                int i4 = length;
                String str4 = string2;
                if (!(new StaticLayout(sb4, paint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1)) {
                    str = str3;
                    break;
                }
                i = i3 + 1;
                length = i4;
                string2 = str4;
                str2 = str3;
            }
            if (str2 != null) {
                str = str2;
            }
        }
        textView.setText(str);
    }
}
