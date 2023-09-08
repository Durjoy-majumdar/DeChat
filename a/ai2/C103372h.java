package ai2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import bi2.C104148f;
import bi2.C104149h;
import bi2.C92262a;
import bi2.C92267g;
import gi2.C107818f;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.ListIterator;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49044cs2;

/* renamed from: ai2.h */
public final class C103372h extends C92021o {

    /* renamed from: p0 */
    public long f304860p0;

    public C103372h(Context context) {
        super(context);
    }

    private final long getLastLrcTime() {
        return getMusicDuration() > 0 ? getMusicDuration() : ((C49044cs2) C110818d0.m150923U(getLyricsList())).f131929e + getLAST_INTERVAL();
    }

    private final long getMusicDuration() {
        C92020n lyricsItem = getLyricsItem();
        if (lyricsItem != null) {
            return lyricsItem.f263464h;
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo53770a(long j) {
        this.f304860p0 = j;
        while (this.f304860p0 > getLastLrcTime()) {
            this.f304860p0 -= getLastLrcTime();
        }
        return C107818f.C107819a.m146079c(this, j);
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        if (getBitmapList().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : getLyricsList()) {
            int i2 = i + 1;
            if (i >= 0) {
                C49044cs2 cs22 = (C49044cs2) next;
                if (i < getBitmapList().size()) {
                    Bitmap bitmap = getBitmapList().get(i);
                    C87412m.m108593f(bitmap, "bitmapList[index]");
                    arrayList.add(new C92267g(cs22, bitmap));
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(getTouchTracker().f321806g);
        return new C104148f(arrayList, matrix2, getMusicDuration());
    }

    /* renamed from: j */
    public void mo125952j() {
        if (getCurIndex() < getLyricsList().size()) {
            long j = getLyricsList().get(getCurIndex()).f131929e;
            boolean z = true;
            C49044cs2 cs22 = (C49044cs2) C110818d0.m150917O(getLyricsList(), getCurIndex() + 1);
            long lastLrcTime = cs22 != null ? cs22.f131929e : getLastLrcTime();
            long trans_time = getTRANS_TIME();
            long j2 = this.f304860p0;
            long j3 = j2 - j;
            if (0 <= j3 && j3 <= trans_time) {
                setAlpha((int) ((((float) 255) * ((float) (j2 - j))) / ((float) getTRANS_TIME())));
                return;
            }
            long trans_time2 = getTRANS_TIME();
            long j4 = this.f304860p0;
            long j5 = lastLrcTime - j4;
            if (0 > j5 || j5 > trans_time2) {
                z = false;
            }
            if (z) {
                setAlpha((int) (((float) 255) * (((float) (lastLrcTime - j4)) / ((float) getTRANS_TIME()))));
            } else if (j4 - j <= getTRANS_TIME() || lastLrcTime - this.f304860p0 <= getTRANS_TIME()) {
                setAlpha(0);
            } else {
                setAlpha(255);
            }
        }
    }

    /* renamed from: k */
    public void mo125953k(long j) {
        if (getWaveAlpha() < 255) {
            long trans_time = getTRANS_TIME();
            long j2 = this.f304860p0;
            long j3 = j2 - j;
            boolean z = false;
            if (0 <= j3 && j3 <= trans_time) {
                z = true;
            }
            if (z) {
                setWaveAlpha((int) ((((float) 255) * ((float) (j2 - j))) / ((float) getTRANS_TIME())));
            } else if (j2 - j > getTRANS_TIME()) {
                setWaveAlpha(255);
            }
        }
    }

    /* renamed from: l */
    public void mo125954l() {
        int i;
        boolean z;
        if (!getLyricsList().isEmpty()) {
            ArrayList<C49044cs2> lyricsList = getLyricsList();
            ListIterator<C49044cs2> listIterator = lyricsList.listIterator(lyricsList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (this.f304860p0 >= listIterator.previous().f131929e) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            setCurIndex(Math.max(0, i));
        }
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        if (getViewMatrix() != null) {
            canvas.setMatrix(getViewMatrix());
        } else {
            canvas.setMatrix(getTouchTracker().f321806g);
        }
        if (isActivated()) {
            getFrameDrawable().draw(canvas);
        }
        mo125954l();
        mo125923g(canvas);
        if ((!getBitmapList().isEmpty()) && getCurIndex() < getBitmapList().size()) {
            mo125952j();
            getPaint().setAlpha(getAlpha());
            canvas.drawBitmap(getBitmapList().get(getCurIndex()), 0.0f, getLYRICS_VERTICAL_OFFSET(), getPaint());
        }
        canvas.restore();
        if (getNeedInvalidate()) {
            invalidate();
        }
    }

    /* renamed from: q */
    public C104149h mo143278q(C92020n nVar) {
        C87412m.m108594g(nVar, "item");
        mo125955o(nVar.f263463g);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : getLyricsList()) {
            int i2 = i + 1;
            if (i >= 0) {
                Bitmap bitmap = getBitmapList().get(i);
                C87412m.m108593f(bitmap, "bitmapList[index]");
                arrayList.add(new C92267g((C49044cs2) next, bitmap));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return new C104148f(arrayList, nVar.f263407f, getMusicDuration());
    }
}
