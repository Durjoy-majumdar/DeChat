package kn0;

import android.os.SystemClock;
import android.view.Surface;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import p295b8.C16769e;
import p295b8.C16772f;
import p295b8.C16774g;
import p300c8.C79950j;
import p333e8.C20551y;
import p337f8.C20694l;
import p355l7.C21396d;
import p370p7.C21920c;
import p370p7.C21941l;
import p370p7.C21961u;
import p370p7.C21962v;
import p396x6.C22994b;
import p396x6.C22997e;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23027v;
import p401y6.C23233i;
import p404z6.C91618d;

/* renamed from: kn0.f */
public final class C21361f implements C23017p.C23018a, C23233i, C20694l, C21920c, C21941l.C21942a, C21396d.C21397a {

    /* renamed from: h */
    public static final NumberFormat f60428h;

    /* renamed from: d */
    public final C16769e f60429d;

    /* renamed from: e */
    public final C23027v.C23030c f60430e = new C23027v.C23030c();

    /* renamed from: f */
    public final C23027v.C23029b f60431f = new C23027v.C23029b();

    /* renamed from: g */
    public final long f60432g = SystemClock.elapsedRealtime();

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        f60428h = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }

    public C21361f(C16769e eVar) {
        this.f60429d = eVar;
    }

    /* renamed from: u */
    public static String m24023u(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    /* renamed from: w */
    public static String m24024w(long j) {
        return j == -9223372036854775807L ? "?" : f60428h.format((double) (((float) j) / 1000.0f));
    }

    /* renamed from: a */
    public void mo32402a(int i, int i2, int i3, float f) {
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", "videoSizeChanged [" + i + ", " + i2 + ", " + i3 + ", " + f + "]");
    }

    /* renamed from: b */
    public void mo33441b(String str, long j, long j2) {
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", "audioDecoderInitialized [" + mo33455v() + ", " + str + ", " + j2 + "]");
    }

    /* renamed from: c */
    public void mo32403c(int i, long j) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "droppedFrames [" + mo33455v() + ", " + i + "]");
    }

    /* renamed from: d */
    public void mo33442d() {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "onHasEndTag");
    }

    /* renamed from: e */
    public void mo33443e(int i) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "audioSessionId [" + i + "]");
    }

    /* renamed from: f */
    public void mo32404f(Surface surface) {
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", "renderedFirstFrame [" + surface + "]");
    }

    /* renamed from: g */
    public void mo33444g(Metadata metadata) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "onMetadata [");
        mo33457y(metadata, "  ");
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "]");
    }

    /* renamed from: h */
    public void mo33445h(C91618d dVar) {
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", "audioDisabled [" + mo33455v() + ", " + C88235m.m109884c(dVar) + "]");
    }

    /* renamed from: i */
    public void mo32405i(C91618d dVar) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "videoEnabled [" + mo33455v() + "]");
    }

    /* renamed from: j */
    public void mo33446j(Format format) {
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", "audioFormatChanged [" + mo33455v() + ", " + Format.m16652t(format) + "]");
    }

    /* renamed from: k */
    public void mo33447k(int i, Format format, int i2, Object obj, long j) {
    }

    /* renamed from: l */
    public void mo33448l(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        mo33456x("loadError", iOException);
    }

    /* renamed from: m */
    public void mo33449m(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
    }

    /* renamed from: n */
    public void mo33450n(C91618d dVar) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "audioEnabled [" + mo33455v() + "]");
    }

    /* renamed from: o */
    public void mo33451o(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
    }

    public void onLoadError(IOException iOException) {
        mo33456x("loadError", iOException);
    }

    public void onLoadingChanged(boolean z) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "loading [" + z + "]");
    }

    public void onPlaybackParametersChanged(C23016o oVar) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "playbackParameters " + String.format("[speed=%.2f, pitch=%.2f]", new Object[]{Float.valueOf(oVar.f66186a), Float.valueOf(oVar.f66187b)}));
    }

    public void onPlayerError(C22997e eVar) {
        Log.printErrStackTrace("MicroMsg.Video.Exo.EventLogger", eVar, "playerFailed [" + mo33455v() + "]", new Object[0]);
    }

    public void onPlayerStateChanged(boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("state [");
        sb.append(mo33455v());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : ExifInterface.LONGITUDE_EAST : "R" : "B" : "I");
        sb.append("]");
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", sb.toString());
    }

    public void onPositionDiscontinuity() {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "positionDiscontinuity");
    }

    public void onRepeatModeChanged(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("repeatMode [");
        sb.append(i != 0 ? i != 1 ? i != 2 ? "?" : NetstatsParserPatterns.TYPE_BOTH_PATTERN : "ONE" : "OFF");
        sb.append("]");
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", sb.toString());
    }

    public void onTimelineChanged(C23027v vVar, Object obj) {
        int f = vVar.mo35005f();
        int j = vVar.mo35006j();
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "sourceInfo [periodCount=" + f + ", windowCount=" + j);
        for (int i = 0; i < Math.min(f, 3); i++) {
            vVar.mo36342d(i, this.f60431f);
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "  period [" + m24024w(C22994b.m27204b(this.f60431f.f66209d)) + "]");
        }
        if (f > 3) {
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "  ...");
        }
        for (int i2 = 0; i2 < Math.min(j, 3); i2++) {
            vVar.mo36344h(i2, this.f60430e, false);
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "  window [" + m24024w(C22994b.m27204b(this.f60430e.f66225i)) + ", " + this.f60430e.f66220d + ", " + this.f60430e.f66221e + "]");
        }
        if (j > 3) {
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "  ...");
        }
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "]");
    }

    public void onTracksChanged(C21962v vVar, C16774g gVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C21361f fVar;
        C21361f fVar2 = this;
        C16769e.C16770a aVar = fVar2.f60429d.f45328c;
        if (aVar == null) {
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "Tracks []");
            return;
        }
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "Tracks [");
        int i = 0;
        while (true) {
            str = ", supported=";
            str2 = ", ";
            str3 = " Track:";
            str4 = "  ]";
            str5 = "    ]";
            if (i >= aVar.f45329a) {
                break;
            }
            C21962v vVar2 = aVar.f45330b[i];
            C16772f fVar3 = gVar.f45335b[i];
            if (vVar2.f62177a > 0) {
                StringBuilder sb = new StringBuilder();
                String str6 = "[ ]";
                sb.append("  Renderer:");
                sb.append(i);
                sb.append(" [");
                Log.m105918d("MicroMsg.Video.Exo.EventLogger", sb.toString());
                int i2 = 0;
                while (i2 < vVar2.f62177a) {
                    C21961u uVar = vVar2.f62178b[i2];
                    C21962v vVar3 = vVar2;
                    int i3 = uVar.f62173a;
                    String str7 = str4;
                    int i4 = aVar.f45330b[i].f62178b[i2].f62173a;
                    int[] iArr = new int[i4];
                    String str8 = str;
                    String str9 = str5;
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < i4) {
                        int i7 = i4;
                        String str10 = str2;
                        if ((aVar.f45332d[i][i2][i6] & 7) == 4) {
                            iArr[i5] = i6;
                            i5++;
                        }
                        i6++;
                        i4 = i7;
                        str2 = str10;
                    }
                    String str11 = str2;
                    int[] copyOf = Arrays.copyOf(iArr, i5);
                    String str12 = null;
                    String str13 = str3;
                    int i8 = 16;
                    int i9 = 0;
                    boolean z = false;
                    int i15 = 0;
                    while (i9 < copyOf.length) {
                        int[] iArr2 = copyOf;
                        String str14 = aVar.f45330b[i].f62178b[i2].f62174b[copyOf[i9]].f45777i;
                        int i16 = i15 + 1;
                        if (i15 == 0) {
                            str12 = str14;
                        } else {
                            z |= !C20551y.m22311a(str12, str14);
                        }
                        i8 = Math.min(i8, aVar.f45332d[i][i2][i9] & 24);
                        i9++;
                        i15 = i16;
                        copyOf = iArr2;
                    }
                    if (z) {
                        i8 = Math.min(i8, aVar.f45331c[i]);
                    }
                    String str15 = i3 < 2 ? "N/A" : i8 != 0 ? i8 != 8 ? i8 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", "    Group:" + i2 + ", adaptive_supported=" + str15 + " [");
                    for (int i17 = 0; i17 < uVar.f62173a; i17++) {
                        String str16 = fVar3 != null && fVar3.mo17794f() == uVar && fVar3.mo17792e(i17) != -1 ? "[X]" : str6;
                        String u = m24023u(aVar.f45332d[i][i2][i17] & 7);
                        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "      " + str16 + str13 + i17 + str11 + Format.m16652t(uVar.f62174b[i17]) + str8 + u);
                    }
                    String str17 = str9;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str17);
                    i2++;
                    str5 = str17;
                    str2 = str11;
                    str = str8;
                    str4 = str7;
                    str3 = str13;
                    vVar2 = vVar3;
                }
                String str18 = str4;
                String str19 = str5;
                if (fVar3 != null) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= fVar3.length()) {
                            break;
                        }
                        Metadata metadata = fVar3.mo17791d(i18).f45775g;
                        if (metadata != null) {
                            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "    Metadata [");
                            fVar = this;
                            fVar.mo33457y(metadata, "      ");
                            Log.m105918d("MicroMsg.Video.Exo.EventLogger", str19);
                            break;
                        }
                        i18++;
                    }
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str18);
                }
                fVar = this;
                Log.m105918d("MicroMsg.Video.Exo.EventLogger", str18);
            } else {
                fVar = fVar2;
            }
            i++;
            fVar2 = fVar;
        }
        String str20 = str3;
        String str21 = str4;
        String str22 = "[ ]";
        String str23 = str;
        String str24 = str2;
        C21361f fVar4 = fVar2;
        String str25 = str5;
        C21962v vVar4 = aVar.f45333e;
        if (vVar4.f62177a > 0) {
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", "  Renderer:None [");
            for (int i19 = 0; i19 < vVar4.f62177a; i19++) {
                Log.m105918d("MicroMsg.Video.Exo.EventLogger", "    Group:" + i19 + " [");
                C21961u uVar2 = vVar4.f62178b[i19];
                int i25 = 0;
                while (i25 < uVar2.f62173a) {
                    String u2 = m24023u(0);
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", "      " + str22 + str20 + i25 + str24 + Format.m16652t(uVar2.f62174b[i25]) + str23 + u2);
                    i25++;
                    vVar4 = vVar4;
                }
                C21962v vVar5 = vVar4;
                Log.m105918d("MicroMsg.Video.Exo.EventLogger", str25);
            }
            Log.m105918d("MicroMsg.Video.Exo.EventLogger", str21);
        }
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "]");
    }

    /* renamed from: p */
    public void mo32406p(String str, long j, long j2) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "videoDecoderInitialized [" + mo33455v() + ", " + str + ", " + j2 + "]");
    }

    /* renamed from: q */
    public void mo32407q(Format format) {
        Log.m105924i("MicroMsg.Video.Exo.EventLogger", "videoFormatChanged [" + mo33455v() + ", " + Format.m16652t(format) + "]");
    }

    /* renamed from: r */
    public void mo32408r(C91618d dVar) {
        Log.m105918d("MicroMsg.Video.Exo.EventLogger", "videoDisabled [" + mo33455v() + ", " + C88235m.m109884c(dVar) + "]");
    }

    /* renamed from: s */
    public void mo33453s(int i, long j, long j2) {
        mo33456x("audioTrackUnderrun [" + i + ", " + j + ", " + j2 + "]", (Exception) null);
    }

    /* renamed from: t */
    public void mo33454t(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
    }

    /* renamed from: v */
    public final String mo33455v() {
        return m24024w(SystemClock.elapsedRealtime() - this.f60432g);
    }

    /* renamed from: x */
    public final void mo33456x(String str, Exception exc) {
        Log.printErrStackTrace("MicroMsg.Video.Exo.EventLogger", exc, "internalError [" + mo33455v() + ", " + str + "]", new Object[0]);
    }

    /* renamed from: y */
    public final void mo33457y(Metadata metadata, String str) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f45801d;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                if (entry instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s: value=%s", new Object[]{textInformationFrame.f45820d, textInformationFrame.f45824f}));
                } else if (entry instanceof UrlLinkFrame) {
                    UrlLinkFrame urlLinkFrame = (UrlLinkFrame) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s: url=%s", new Object[]{urlLinkFrame.f45820d, urlLinkFrame.f45826f}));
                } else if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s: owner=%s", new Object[]{privFrame.f45820d, privFrame.f45821e}));
                } else if (entry instanceof GeobFrame) {
                    GeobFrame geobFrame = (GeobFrame) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s: mimeType=%s, filename=%s, description=%s", new Object[]{geobFrame.f45820d, geobFrame.f45816e, geobFrame.f45817f, geobFrame.f45818g}));
                } else if (entry instanceof ApicFrame) {
                    ApicFrame apicFrame = (ApicFrame) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s: mimeType=%s, description=%s", new Object[]{apicFrame.f45820d, apicFrame.f45808e, apicFrame.f45809f}));
                } else if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s: language=%s, description=%s", new Object[]{commentFrame.f45820d, commentFrame.f45813e, commentFrame.f45814f}));
                } else if (entry instanceof Id3Frame) {
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("%s", new Object[]{((Id3Frame) entry).f45820d}));
                } else if (entry instanceof EventMessage) {
                    EventMessage eventMessage = (EventMessage) entry;
                    Log.m105918d("MicroMsg.Video.Exo.EventLogger", str + String.format("EMSG: scheme=%s, id=%d, value=%s", new Object[]{eventMessage.f45802d, Long.valueOf(eventMessage.f45805g), eventMessage.f45803e}));
                }
                i++;
            } else {
                return;
            }
        }
    }
}
