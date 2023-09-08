package b63;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.Iterator;
import p749xh.C38662s9;
import sf0.C48374j0;
import te3.C64419hc3;
import te3.az4;
import te3.qy4;
import te3.xy4;
import te3.yy4;

/* renamed from: b63.o0 */
public class C54429o0 extends C38662s9 {

    /* renamed from: y */
    public static IAutoDBItem.MAutoDBInfo f152660y = C38662s9.initAutoDBInfo(C54429o0.class);

    /* renamed from: p */
    public C64419hc3 f152661p;

    /* renamed from: q */
    public qy4 f152662q;

    /* renamed from: r */
    public yy4 f152663r;

    /* renamed from: s */
    public boolean f152664s;

    /* renamed from: t */
    public String f152665t;

    /* renamed from: u */
    public String f152666u;

    /* renamed from: v */
    public String f152667v;

    /* renamed from: w */
    public String f152668w;

    /* renamed from: x */
    public String f152669x;

    public C54429o0() {
        this.f152661p = new C64419hc3();
        this.f152662q = null;
        this.f152663r = null;
        this.f152664s = false;
        this.f152665t = "";
        this.f152666u = "";
        this.f152667v = "";
        this.f152668w = "";
        this.f152669x = "";
        this.f152662q = new qy4();
        if (this.f152663r == null) {
            this.f152663r = new yy4();
        }
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        C64419hc3 hc32 = new C64419hc3();
        this.f152661p = hc32;
        try {
            C64419hc3 hc33 = (C64419hc3) hc32.parseFrom(this.field_wallet_grey_item_buf);
            this.f152661p = hc33;
            this.f152662q = hc33.f183469h;
            this.f152663r = hc33.f183470i;
            this.f152664s = hc33.f183472n;
            this.f152669x = "";
            Iterator<String> it = hc33.f183474p.iterator();
            while (it.hasNext()) {
                this.f152669x += it.next() + "\n";
            }
            az4 az4 = this.f152661p.f183467f;
            if (az4 != null) {
                this.f152665t = C48374j0.m53713b(az4.f130855d);
                this.f152666u = C48374j0.m53713b(this.f152661p.f183467f.f130856e);
            }
            xy4 xy4 = this.f152661p.f183468g;
            if (xy4 != null) {
                this.f152667v = C48374j0.m53713b(xy4.f145026d);
                this.f152668w = C48374j0.m53713b(this.f152661p.f183468g.f145027e);
            }
            Log.m105927v("WalletRegionGreyItem", "noticeContent %s", this.f152667v);
        } catch (Exception unused) {
            Log.m105920e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
        }
        if (this.f152662q == null) {
            this.f152662q = new qy4();
        }
        if (this.f152663r == null) {
            this.f152663r = new yy4();
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f152660y;
    }
}
