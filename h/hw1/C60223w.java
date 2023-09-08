package hw1;

import android.media.MediaFormat;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import lu3.C88656g;
import p914oj.C110052b;

/* renamed from: hw1.w */
public class C60223w implements C88656g {

    /* renamed from: d */
    public String f171724d;

    /* renamed from: e */
    public int f171725e;

    /* renamed from: f */
    public MediaFormat f171726f;

    /* renamed from: g */
    public MediaFormat f171727g;

    /* renamed from: h */
    public GalleryItem$VideoMediaItem f171728h;

    /* renamed from: i */
    public C60225b f171729i;

    /* renamed from: hw1.w$a */
    public class C60224a implements Runnable {
        public C60224a() {
        }

        public void run() {
            C60223w wVar = C60223w.this;
            C60225b bVar = wVar.f171729i;
            if (bVar != null) {
                bVar.mo85218a(wVar);
            }
        }
    }

    /* renamed from: hw1.w$b */
    public interface C60225b {
        /* renamed from: a */
        void mo85218a(C60223w wVar);
    }

    public C60223w(String str, int i, GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, C60225b bVar) {
        this.f171724d = str;
        this.f171725e = i;
        this.f171728h = galleryItem$VideoMediaItem;
        this.f171729i = bVar;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj instanceof C60223w) {
            if (this != obj) {
                C60223w wVar = (C60223w) obj;
                if (this.f171725e == wVar.f171725e || ((str = this.f171724d) != null && str.equals(wVar.f171724d))) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public String getKey() {
        return "video_analysis";
    }

    public void run() {
        int i;
        C110052b bVar = new C110052b();
        try {
            bVar.mo161392k(this.f171724d);
            int d = bVar.mo161385d();
            int i2 = 0;
            while (true) {
                if (i2 >= d) {
                    break;
                }
                MediaFormat e = bVar.mo161386e(i2);
                if (e.containsKey("mime")) {
                    String string = e.getString("mime");
                    i = d;
                    Log.m105919d("VideoAnalysisTask", "find video mime : %s", string);
                    if (string != null) {
                        if (string.startsWith("video/")) {
                            if (this.f171726f == null) {
                                this.f171726f = e;
                            }
                        } else if (string.startsWith("audio/") && this.f171727g == null) {
                            this.f171727g = e;
                        }
                        if (!(this.f171727g == null || this.f171726f == null)) {
                            break;
                        }
                    }
                } else {
                    Log.m105918d("VideoAnalysisTask", "find video mime : not found.");
                    i = d;
                }
                i2++;
                d = i;
            }
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f171728h;
            if (galleryItem$VideoMediaItem != null) {
                MediaFormat mediaFormat = this.f171726f;
                String str = "";
                if (mediaFormat != null) {
                    galleryItem$VideoMediaItem.f162766w = !mediaFormat.containsKey("durationUs") ? 0 : (int) (this.f171726f.getLong("durationUs") / 1000);
                    this.f171728h.f162767x = !this.f171726f.containsKey("height") ? 0 : this.f171726f.getInteger("height");
                    this.f171728h.f162768y = !this.f171726f.containsKey("width") ? 0 : this.f171726f.getInteger("width");
                    this.f171728h.f162764u = !this.f171726f.containsKey("mime") ? str : this.f171726f.getString("mime");
                    this.f171728h.f162769z = !this.f171726f.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? 0 : this.f171726f.getInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                    this.f171728h.f162761A = !this.f171726f.containsKey("i-frame-interval") ? 0 : this.f171726f.getInteger("i-frame-interval");
                    this.f171728h.f162762B = !this.f171726f.containsKey("frame-rate") ? 0 : this.f171726f.getInteger("frame-rate");
                }
                MediaFormat mediaFormat2 = this.f171727g;
                if (mediaFormat2 != null) {
                    GalleryItem$VideoMediaItem galleryItem$VideoMediaItem2 = this.f171728h;
                    if (mediaFormat2.containsKey("mime")) {
                        str = this.f171727g.getString("mime");
                    }
                    galleryItem$VideoMediaItem2.f162765v = str;
                }
            }
        } catch (Exception e2) {
            Log.m105919d("VideoAnalysisTask", "Video extractor init failed. video path = [%s] e = [%s]", this.f171724d, e2.getMessage());
        } catch (Throwable th) {
            bVar.mo161388g();
            throw th;
        }
        bVar.mo161388g();
        if (this.f171729i == null) {
            Log.m105919d("VideoAnalysisTask", "video analysis end. observer == null, position = [%d], mediaItem = [%s]", Integer.valueOf(this.f171725e), this.f171728h);
        } else {
            MMHandlerThread.postToMainThread(new C60224a());
        }
    }
}
