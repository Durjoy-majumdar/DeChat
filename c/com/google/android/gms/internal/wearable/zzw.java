package com.google.android.gms.internal.wearable;

public final class zzw {
    private static final int zzhn = 11;
    private static final int zzho = 12;
    private static final int zzhp = 16;
    private static final int zzhq = 26;
    private static final int[] zzhr = new int[0];
    public static final long[] zzhs = new long[0];
    public static final float[] zzht = new float[0];
    private static final double[] zzhu = new double[0];
    private static final boolean[] zzhv = new boolean[0];
    public static final String[] zzhw = new String[0];
    private static final byte[][] zzhx = new byte[0][];
    public static final byte[] zzhy = new byte[0];

    public static final int zzb(zzk zzk, int i) {
        int position = zzk.getPosition();
        zzk.zzd(i);
        int i2 = 1;
        while (zzk.zzj() == i) {
            zzk.zzd(i);
            i2++;
        }
        zzk.zzc(position, i);
        return i2;
    }
}
