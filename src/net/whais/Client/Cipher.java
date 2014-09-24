package net.whais.Client;

import java.nio.ByteBuffer;

interface Cipher
{
    abstract byte type ();
    abstract int prepareAuthResponse (ByteBuffer frame, String database, byte[] key);
    abstract int metadataSize ();
    abstract void encodeFrame (CommunicationFrame frame, byte[] key);
    abstract void decodeFrame (CommunicationFrame frame, byte[] key);
}
