package ip0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2encoder;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: ip0.f */
public class C87787f extends C87786e {

    /* renamed from: h */
    public int f254155h;

    /* renamed from: i */
    public int f254156i;

    /* renamed from: c */
    public final void mo122238c() {
        RandomAccessFile B = C86013q1.m106420B(this.f254154g.mo119971i(), true);
        B.seek(0);
        int i = this.f254155h;
        int i2 = this.f254156i;
        long r = this.f254154g.mo119980r();
        long j = 36 + r;
        long j2 = (long) i;
        long j3 = (long) (((i * 16) * i2) / 8);
        B.write(new byte[]{82, 73, 70, 70, (byte) ((int) (j & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, v2encoder.enumCODEC_vcodec2, 0, 0, 0, 1, 0, (byte) i2, 0, (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) (j3 & 255)), (byte) ((int) ((j3 >> 8) & 255)), (byte) ((int) ((j3 >> 16) & 255)), (byte) ((int) ((j3 >> 24) & 255)), (byte) (i2 * 2), 0, v2encoder.enumCODEC_vcodec2, 0, 100, 97, 116, 97, (byte) ((int) (r & 255)), (byte) ((int) ((r >> 8) & 255)), (byte) ((int) ((r >> 16) & 255)), (byte) ((int) ((r >> 24) & 255))});
        B.close();
    }

    public void close() {
        super.close();
        try {
            mo122238c();
        } catch (IOException e) {
            Log.printInfoStack("Luggage.PCMAudioEncoder", "", e);
        }
    }

    public boolean init(String str, int i, int i2, int i3) {
        this.f254155h = i;
        this.f254156i = i2;
        super.init(str, i, i2, i3);
        return true;
    }
}
