package ma2;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ma2.C99819r;

/* renamed from: ma2.s */
public class C61453s implements C99819r {

    /* renamed from: a */
    public ArrayList<C99819r.C61452a> f174762a = new ArrayList<>();

    /* renamed from: b */
    public LinkedList<Long> f174763b = new LinkedList<>();

    /* renamed from: c */
    public int f174764c = 0;

    /* renamed from: d */
    public long f174765d;

    /* renamed from: d */
    public static int m72162d(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return str.length() <= 0 ? i : Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            Log.printErrStackTrace("MicroMsg.Music.LyricObj", e, "getInt", new Object[0]);
            return i;
        }
    }

    /* renamed from: e */
    public static String m72163e(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return str;
        }
        if (str2.length() >= str.length() - 1) {
            return "";
        }
        String substring = str.substring(str2.length(), str.length() - 1);
        Log.m105919d("MicroMsg.Music.LyricObj", "str[%s] prefix[%s] attr[%s]", str, str2, substring);
        return substring;
    }

    /* renamed from: f */
    public static C61453s m72164f(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3) {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        int i3;
        String str5 = str;
        C61453s sVar = new C61453s();
        long currentTicks = Util.currentTicks();
        long j4 = 0;
        int i4 = 0;
        int i5 = 1;
        if (!Util.isNullOrNil(str)) {
            if (str5 != null) {
                Matcher matcher = Pattern.compile("(\\[((\\d{2}:\\d{2}(\\.\\d{2}){0,1}\\])|(al:|ar:|by:|offset:|re:|ti:|ve:))[^\\[]*)").matcher(str5.replaceAll("\n", " ").replaceAll("\r", " "));
                while (matcher.find()) {
                    String group = matcher.group();
                    matcher.start();
                    matcher.end();
                    if (group != null) {
                        if (!group.startsWith("[ti:")) {
                            if (!group.startsWith("[ar:")) {
                                if (!group.startsWith("[al:")) {
                                    if (!group.startsWith("[by:")) {
                                        if (!group.startsWith("[offset:")) {
                                            if (!group.startsWith("[re:")) {
                                                if (!group.startsWith("[ve:")) {
                                                    Pattern compile = Pattern.compile("\\[(\\d{2}:\\d{2}(\\.\\d{2}){0,1})\\]");
                                                    Matcher matcher2 = compile.matcher(group);
                                                    C99819r.C61452a aVar = new C99819r.C61452a();
                                                    while (true) {
                                                        if (!matcher2.find()) {
                                                            j4 = 0;
                                                            break;
                                                        }
                                                        if (matcher2.groupCount() > 0) {
                                                            try {
                                                                String[] split = matcher2.group(i5).split(XVFSFile.PATH_SEPARATOR);
                                                                int d = m72162d(split[i4], i4);
                                                                if (split.length > i5) {
                                                                    String[] split2 = split[i5].split("\\.");
                                                                    int d2 = m72162d(split2[0], 0);
                                                                    if (split2.length > 1) {
                                                                        i2 = m72162d(split2[1], 0);
                                                                        i = d2;
                                                                        j2 = currentTicks;
                                                                        j3 = ((long) (i2 * 10)) + (((long) d) * 60 * 1000) + ((long) (i * 1000));
                                                                        aVar.f174760b = j3;
                                                                    } else {
                                                                        i3 = d2;
                                                                    }
                                                                } else {
                                                                    i3 = 0;
                                                                }
                                                                i = i3;
                                                                i2 = 0;
                                                                j2 = currentTicks;
                                                                j3 = ((long) (i2 * 10)) + (((long) d) * 60 * 1000) + ((long) (i * 1000));
                                                            } catch (Exception e) {
                                                                j2 = currentTicks;
                                                                Log.printErrStackTrace("MicroMsg.Music.LyricObj", e, "", new Object[0]);
                                                                Log.m105929w("MicroMsg.Music.LyricObj", "strToLong error: %s", e.getLocalizedMessage());
                                                                j3 = 0;
                                                            }
                                                            aVar.f174760b = j3;
                                                        } else {
                                                            j2 = currentTicks;
                                                        }
                                                        String[] split3 = compile.split(group);
                                                        if (split3 == null || split3.length <= 0) {
                                                            sVar.f174763b.add(Long.valueOf(aVar.f174760b));
                                                            currentTicks = j2;
                                                            j4 = 0;
                                                            i4 = 0;
                                                            i5 = 1;
                                                        } else {
                                                            String str6 = split3[split3.length - 1];
                                                            if (str6 != null) {
                                                                str6 = str6.trim();
                                                            }
                                                            if (Util.isNullOrNil(str6)) {
                                                                str6 = " ";
                                                            }
                                                            aVar.f174761c = str6;
                                                            for (int i6 = 0; i6 < sVar.f174763b.size(); i6++) {
                                                                C99819r.C61452a aVar2 = new C99819r.C61452a();
                                                                aVar2.f174760b = sVar.f174763b.get(i6).longValue();
                                                                aVar2.f174761c = aVar.f174761c;
                                                                aVar2.f174759a = true;
                                                            }
                                                            sVar.f174763b.clear();
                                                            if (!aVar.mo86424a()) {
                                                                int size = sVar.f174762a.size();
                                                                while (true) {
                                                                    size--;
                                                                    if (size >= 0 && sVar.f174762a.get(size).f174760b != aVar.f174760b) {
                                                                        if (sVar.f174762a.get(size).f174760b < aVar.f174760b) {
                                                                            sVar.f174762a.add(size + 1, aVar);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                if (size < 0) {
                                                                    sVar.f174762a.add(0, aVar);
                                                                }
                                                            }
                                                            currentTicks = j2;
                                                            i4 = 0;
                                                            i5 = 1;
                                                        }
                                                    }
                                                } else {
                                                    m72163e(group, "[ve:");
                                                }
                                            } else {
                                                m72163e(group, "[re:");
                                            }
                                        } else {
                                            sVar.f174765d = Util.getLong(m72163e(group, "[offset:"), j4);
                                        }
                                    } else {
                                        m72163e(group, "[by:");
                                    }
                                } else {
                                    m72163e(group, "[al:");
                                }
                            } else {
                                m72163e(group, "[ar:");
                            }
                        } else {
                            m72163e(group, "[ti:");
                        }
                    } else {
                        Log.m105928w("MicroMsg.Music.LyricObj", "parserLine fail: lrcMgr or str is null");
                    }
                }
                j = currentTicks;
                Log.m105919d("MicroMsg.Music.LyricObj", "handle offset %d", Long.valueOf(sVar.f174765d));
                if (sVar.f174765d != 0) {
                    for (int i7 = 0; i7 < sVar.f174762a.size(); i7++) {
                        sVar.f174762a.get(i7).f174760b += sVar.f174765d;
                    }
                    sVar.f174765d = 0;
                }
                for (int i8 = 0; i8 < sVar.f174762a.size() - 1; i8++) {
                    C99819r.C61452a aVar3 = sVar.f174762a.get(i8);
                    if (aVar3.f174759a && aVar3.f174761c.equals(sVar.f174762a.get(i8 + 1).f174761c)) {
                        aVar3.f174761c = " ";
                    }
                }
            } else {
                j = currentTicks;
                Log.m105928w("MicroMsg.Music.LyricObj", "parserLrc: but lrc or lrcMgr is null");
            }
            Log.m105919d("MicroMsg.Music.LyricObj", "getLrcMgr beg: src lrc = %s", str5);
            Log.m105919d("MicroMsg.Music.LyricObj", "parse finish: sentence size [%d], result:", Integer.valueOf(sVar.f174762a.size()));
        } else {
            j = currentTicks;
            C99819r.C61452a aVar4 = new C99819r.C61452a();
            aVar4.f174760b = 0;
            if (z2) {
                aVar4.f174761c = str4;
            } else if (!z) {
                aVar4.f174761c = MMApplicationContext.getContext().getString(C0966R.string.h9r);
            } else {
                aVar4.f174761c = "";
            }
            if (aVar4.f174761c != null) {
                sVar.f174762a.add(aVar4);
            }
        }
        if (z3) {
            if (Util.isNullOrNil(str3)) {
                Log.m105928w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
            } else {
                C99819r.C61452a aVar5 = new C99819r.C61452a();
                aVar5.f174760b = 0;
                aVar5.f174761c = MMApplicationContext.getContext().getString(C0966R.string.k8v, new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str3)});
                if (sVar.f174762a.isEmpty()) {
                    sVar.f174762a.add(aVar5);
                } else if (sVar.f174762a.size() == 1) {
                    sVar.f174762a.add(0, aVar5);
                    sVar.f174762a.get(1).f174760b = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                } else {
                    sVar.f174762a.add(0, aVar5);
                    sVar.f174762a.get(1).f174760b = (sVar.f174762a.get(2).f174760b >> 2) * 3;
                }
            }
        }
        if (!Util.isNullOrNil(str) && z3) {
            if (Util.isNullOrNil(str2)) {
                Log.m105928w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
            } else {
                C99819r.C61452a aVar6 = new C99819r.C61452a();
                aVar6.f174760b = 0;
                aVar6.f174761c = str2;
                if (sVar.f174762a.isEmpty()) {
                    sVar.f174762a.add(aVar6);
                } else if (sVar.f174762a.size() == 1) {
                    sVar.f174762a.add(0, aVar6);
                    sVar.f174762a.get(1).f174760b = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                } else {
                    sVar.f174762a.add(0, aVar6);
                    sVar.f174762a.get(1).f174760b = (sVar.f174762a.get(2).f174760b >> 2) * 3;
                }
            }
        }
        Log.m105919d("MicroMsg.Music.LyricObj", "getLrcMgr finish: use %d ms", Long.valueOf(Util.ticksToNow(j)));
        return sVar;
    }

    /* renamed from: a */
    public C99819r.C61452a mo86426a(int i) {
        if (i < 0 || i >= this.f174762a.size()) {
            return null;
        }
        return this.f174762a.get(i);
    }

    /* renamed from: b */
    public int mo86427b() {
        return this.f174762a.size();
    }

    /* renamed from: c */
    public int mo86428c(long j) {
        if (this.f174762a.isEmpty()) {
            Log.m105928w("MicroMsg.Music.LyricObj", "getCurIndex: but sentence list is empty");
            return -1;
        }
        if (this.f174762a.get(this.f174764c).f174760b <= j) {
            int size = this.f174762a.size() - 1;
            int i = this.f174764c;
            while (i < size) {
                if (this.f174762a.get(i).f174760b > j || j >= this.f174762a.get(i + 1).f174760b) {
                    i++;
                } else {
                    this.f174764c = i;
                    return i;
                }
            }
            this.f174764c = size;
        } else {
            for (int i2 = this.f174764c; i2 > 0; i2--) {
                if (this.f174762a.get(i2).f174760b >= j) {
                    int i3 = i2 - 1;
                    if (j > this.f174762a.get(i3).f174760b) {
                        this.f174764c = i3;
                        return i3;
                    }
                }
            }
            this.f174764c = 0;
        }
        Log.m105919d("MicroMsg.Music.LyricObj", "curIndex %d", Integer.valueOf(this.f174764c));
        return this.f174764c;
    }
}
