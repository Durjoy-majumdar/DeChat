package p278yh;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.album.view.ChattingAlbumContainer;

/* renamed from: yh.f */
public class C79111f {

    /* renamed from: a */
    public final View f232272a;

    /* renamed from: b */
    public MMPinProgressBtn f232273b;

    /* renamed from: c */
    public TextView f232274c;

    /* renamed from: d */
    public WeImageView f232275d;

    /* renamed from: e */
    public ChattingAlbumContainer f232276e;

    /* renamed from: f */
    public RoundProgressBtn f232277f;

    /* renamed from: g */
    public TextView f232278g;

    /* renamed from: h */
    public ProgressBar f232279h;

    public C79111f(View view) {
        this.f232272a = view;
    }

    /* renamed from: a */
    public RoundProgressBtn mo109035a() {
        if (this.f232277f == null) {
            this.f232277f = (RoundProgressBtn) this.f232272a.findViewById(C0966R.C0970id.o5f);
        }
        return this.f232277f;
    }

    /* renamed from: b */
    public MMPinProgressBtn mo109036b() {
        if (this.f232273b == null) {
            this.f232273b = (MMPinProgressBtn) this.f232272a.findViewById(C0966R.C0970id.b4k);
        }
        return this.f232273b;
    }
}
