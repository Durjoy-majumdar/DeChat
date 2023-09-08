package la2;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.URL;
import java.util.List;
import qc0.C101106m;
import za2.C102982a;

/* renamed from: la2.j */
public abstract class C99360j implements C99355b {

    /* renamed from: a */
    public C61260d f291347a;

    /* renamed from: b */
    public C101106m f291348b;

    /* renamed from: A */
    public C101106m mo138768A(C101106m mVar) {
        return mVar;
    }

    /* renamed from: B0 */
    public void mo138769B0(C101106m mVar) {
    }

    /* renamed from: C */
    public void mo138770C(C101106m mVar) {
    }

    /* renamed from: E */
    public C101106m mo138771E() {
        return this.f291348b;
    }

    /* renamed from: F */
    public C101106m mo138772F(List<C101106m> list, int i) {
        if (list == null || list.size() == 0 || i >= list.size()) {
            Log.m105924i("MicroMsg.Music.MusicBaseLogic", "music wrapper list error");
            return null;
        }
        this.f291348b = list.get(i);
        Log.m105925i("MicroMsg.Music.MusicBaseLogic", "startPlayNewMusicList:%d", Integer.valueOf(i));
        return this.f291348b;
    }

    /* renamed from: J */
    public void mo138773J(List<C101106m> list, boolean z) {
    }

    /* renamed from: L */
    public void mo138774L() {
        C102982a l = C99364n.m129617l();
        l.getClass();
        Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
        AudioManager audioManager = l.f303912a;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(l.f303913b);
        }
    }

    /* renamed from: M */
    public URL mo138775M(String str) {
        return new URL(str);
    }

    /* renamed from: O */
    public boolean mo138776O(int i) {
        return false;
    }

    /* renamed from: P */
    public void mo138777P(C101106m mVar) {
    }

    /* renamed from: Q */
    public void mo138778Q(C101106m mVar) {
        this.f291348b = mVar;
    }

    /* renamed from: a0 */
    public void mo138780a0(C101106m mVar, int i) {
    }

    /* renamed from: b0 */
    public void mo138781b0(C101106m mVar) {
    }

    /* renamed from: d */
    public String mo138782d(String str) {
        return str;
    }

    /* renamed from: i */
    public void mo138783i(C101106m mVar) {
    }

    public void init() {
    }

    /* renamed from: j */
    public void mo138785j(C101106m mVar) {
    }

    /* renamed from: n0 */
    public void mo138786n0(C101106m mVar) {
    }

    /* renamed from: o */
    public void mo138787o(C101106m mVar) {
        C101106m mVar2 = this.f291348b;
        if (mVar2 == null || !mVar2.mo140555a(mVar)) {
            this.f291348b = mVar;
            return;
        }
        C101106m mVar3 = this.f291348b;
        mVar3.getClass();
        mVar3.f295962g = mVar.f295962g;
        mVar3.f295963h = mVar.f295963h;
        mVar3.f295964i = mVar.f295964i;
        mVar3.f295965j = mVar.f295965j;
        mVar3.f295969q = mVar.f295969q;
        mVar3.f295970r = mVar.f295970r;
        mVar3.f295971s = mVar.f295971s;
        mVar3.f295976x = mVar.f295976x;
        mVar3.f295972t = mVar.f295972t;
        mVar3.f295943D = mVar.f295943D;
        mVar3.f295945F = mVar.f295945F;
        mVar3.f295950K = mVar.f295950K;
        mVar3.f295951L = mVar.f295951L;
        mVar3.f295971s = mVar.f295971s;
        mVar3.f295957S = mVar.f295956R;
        mVar3.f295957S = mVar.f295957S;
        mVar3.f295942C = mVar.f295942C;
        mVar3.f295944E = mVar.f295944E;
        mVar3.f295948I = mVar.f295948I;
        mVar3.f295947H = mVar.f295947H;
        mVar3.f295946G = mVar.f295946G;
        mVar3.f295958T = mVar.f295958T;
        mVar3.f295952M = mVar.f295952M;
    }

    /* renamed from: p0 */
    public void mo138788p0(C101106m mVar) {
    }

    /* renamed from: r */
    public boolean mo138789r(int i) {
        return true;
    }

    public boolean requestFocus() {
        C102982a l = C99364n.m129617l();
        AudioManager audioManager = l.f303912a;
        if (audioManager == null) {
            return false;
        }
        int requestAudioFocus = audioManager.requestAudioFocus(l.f303913b, 3, 2);
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(requestAudioFocus == 1);
        Log.m105925i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", objArr);
        return requestAudioFocus == 1;
    }

    /* renamed from: t */
    public C101106m mo138792t(C101106m mVar) {
        return mVar;
    }

    /* renamed from: u0 */
    public boolean mo138793u0(C101106m mVar) {
        this.f291348b = mVar;
        return true;
    }

    /* renamed from: v0 */
    public void mo138794v0(C101106m mVar) {
    }
}
