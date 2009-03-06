package de.felixbruns.spotify;

public class Command {
	/* Core functionality. */
	public static final int COMMAND_SECRETBLK    = 0x02;
	public static final int COMMAND_PING         = 0x04;
	public static final int COMMAND_GETSUBSTREAM = 0x08;
	public static final int COMMAND_CHANNELDATA  = 0x09;
	public static final int COMMAND_CHANNELERR   = 0x0a;
	public static final int COMMAND_CHANNELABRT  = 0x0b;
	public static final int COMMAND_REQKEY       = 0x0c;
	public static final int COMMAND_AESKEY       = 0x0d;
	public static final int COMMAND_CACHEHASH    = 0x0f;
	public static final int COMMAND_SHAHASH      = 0x10;
	public static final int COMMAND_IMAGE        = 0x19;
	public static final int COMMAND_TOKENNOTIFY  = 0x4f;
	
	/* Rights management. */
	public static final int COMMAND_COUNTRYCODE = 0x1b;
	
	/* P2P related. */
	public static final int COMMAND_P2P_SETUP   = 0x20;
	public static final int COMMAND_P2P_INITBLK = 0x21;
	
	/* Search and metadata. */
	public static final int COMMAND_BROWSE      = 0x30;
	public static final int COMMAND_SEARCH      = 0x31;
	public static final int COMMAND_PLAYLIST    = 0x35;
	
	/* Session management. */
	public static final int COMMAND_NOTIFY      = 0x42;
	public static final int COMMAND_LOG         = 0x48;
	public static final int COMMAND_PONG        = 0x49;
	public static final int COMMAND_PONGACK     = 0x4a;
	public static final int COMMAND_PAUSE       = 0x4b;
	public static final int COMMAND_REQUESTAD   = 0x4e;
	public static final int COMMAND_REQUESTPLAY = 0x4f;
	
	/* Internal. */
	public static final int COMMAND_PRODINFO    = 0x50;
	public static final int COMMAND_WELCOME     = 0x69;
}
