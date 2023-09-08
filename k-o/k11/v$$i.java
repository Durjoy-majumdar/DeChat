package k11;

import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import java.util.Calendar;

public final /* synthetic */ class v$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f29759d;

    /* renamed from: e */
    public final /* synthetic */ long[] f29760e;

    /* renamed from: f */
    public final /* synthetic */ TextView[] f29761f;

    /* renamed from: g */
    public final /* synthetic */ Button f29762g;

    /* renamed from: h */
    public final /* synthetic */ TextView f29763h;

    public /* synthetic */ v$$i(CleanChattingUI cleanChattingUI, long[] jArr, TextView[] textViewArr, Button button, TextView textView) {
        this.f29759d = cleanChattingUI;
        this.f29760e = jArr;
        this.f29761f = textViewArr;
        this.f29762g = button;
        this.f29763h = textView;
    }

    public final void run() {
        boolean z;
        CleanChattingUI cleanChattingUI = this.f29759d;
        long[] jArr = this.f29760e;
        TextView[] textViewArr = this.f29761f;
        Button button = this.f29762g;
        TextView textView = this.f29763h;
        long[] jArr2 = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        Calendar instance = Calendar.getInstance();
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= 2) {
                break;
            }
            long j = jArr[i2];
            TextView textView2 = textViewArr[i2];
            instance.setTimeInMillis(j);
            textView2.setText(cleanChattingUI.getString(C0966R.string.mjt, new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5))}));
            textView2.setTextColor(cleanChattingUI.getResources().getColor(C0966R.color.f3133gi));
            i2++;
        }
        long j2 = jArr[0];
        if (j2 <= 0 || jArr[1] <= j2) {
            z = false;
        }
        button.setEnabled(z);
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
