package p278yh;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.album.view.ChattingAlbumContainer;

/* renamed from: yh.g */
public class C79112g {

    /* renamed from: a */
    public final View f232280a;

    /* renamed from: b */
    public MMPinProgressBtn f232281b;

    /* renamed from: c */
    public View f232282c;

    /* renamed from: d */
    public TextView f232283d;

    /* renamed from: e */
    public WeImageView f232284e;

    /* renamed from: f */
    public ChattingAlbumContainer f232285f;

    /* renamed from: g */
    public RoundProgressBtn f232286g;

    /* renamed from: h */
    public ProgressBar f232287h;

    public C79112g(View view) {
        this.f232280a = view;
    }

    /* renamed from: a */
    public RoundProgressBtn mo109037a() {
        if (this.f232286g == null) {
            this.f232286g = (RoundProgressBtn) this.f232280a.findViewById(C0966R.C0970id.o5f);
        }
        return this.f232286g;
    }

    /* renamed from: b */
    public WeImageView mo109038b() {
        if (this.f232284e == null) {
            this.f232284e = (WeImageView) this.f232280a.findViewById(C0966R.C0970id.f357661b31);
        }
        return this.f232284e;
    }

    /* renamed from: c */
    public MMPinProgressBtn mo109039c() {
        if (this.f232281b == null) {
            this.f232281b = (MMPinProgressBtn) this.f232280a.findViewById(C0966R.C0970id.b4k);
        }
        return this.f232281b;
    }

    /* renamed from: d */
    public ProgressBar mo109040d() {
        if (this.f232287h == null) {
            this.f232287h = (ProgressBar) this.f232280a.findViewById(C0966R.C0970id.ifa);
        }
        return this.f232287h;
    }
}
