/**
 * Copyright 2016-2018 Iulian Popa (popaiulian@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/


package net.whais.Client;

/**
 * Class used to hold global constants used though out this package.
 *
 * @author Iulian POPA
 *
 */

class _c
{
    final static int CLIENT_VERSIONS             = 0x00000001;

    final static int MIN_FRAME_SIZE              = 512;
    final static int MAX_FRAME_SIZE              = 65535;
    final static int DEFAULT_FRAME_SIZE          = MAX_FRAME_SIZE;

    final static byte FRAME_SIZE_OFF             = 0x00;
    final static byte FRAME_TYPE_OFF             = 0x02;
    final static byte FRAME_ENCTYPE_OFF          = 0x03;
    final static byte FRAME_ID_OFF               = 0x04;
    final static byte FRAME_HDR_SIZE             = 0x08;

    final static byte FRAME_TYPE_NORMAL          = 0x00;
    final static byte FRAME_TYPE_AUTH_CLNT       = 0x01;
    final static byte FRAME_TYPE_AUTH_CLNT_RSP   = 0x02;
    final static byte FRAME_TYPE_COMM_NOSYNC     = (byte) 0xFD;
    final static byte FRAME_TYPE_TIMEOUT         = (byte) 0xFE;
    final static byte FRAME_TYPE_SERV_BUSY       = (byte) 0xFF;

    final static byte FRAME_ENCTYPE_PLAIN        = 0x01;
    final static byte FRAME_ENCTYPE_3K           = 0x02;
    final static byte FRAME_ENCTYPE_DES          = 0x03;
    final static byte FRAME_ENCTYPE_3DES         = 0x04;

    final static byte ENC_3K_FIRST_KING_OFF      = 0x00;
    final static byte ENC_3K_SECOND_KING_OFF     = 0x04;
    final static byte ENC_PLAIN_SIZE_OFF         = 0x08;
    final static byte ENC_SPARE_OFF              = 0x0A;
    final static byte ENC_HDR_SIZE               = 0x0C;

    final static byte PLAIN_CLNT_COOKIE_OFF      = 0x00;
    final static byte PLAIN_SERV_COOKIE_OFF      = 0x04;
    final static byte PLAIN_TYPE_OFF             = 0x08;
    final static byte PLAIN_CRC_OFF              = 0x0A;
    final static byte PLAIN_HDR_SIZE             = 0x0C;

    final static byte FRAME_AUTH_VER_OFF         = 0x00;
    final static byte FRAME_AUTH_SIZE_OFF        = 0x04;
    final static byte FRAME_AUTH_SPARE_1_OFF     = 0x06;
    final static byte FRAME_AUTH_CHALLENGE_OFF   = 0x08;
    final static byte FRAME_AUTH_ENC_OFF         = 0x10;
    final static byte FRAME_AUTH_SPARE_2_OFF     = 0x11;
    final static byte FRAME_AUTH_SIZE            = 0x14;

    final static byte FRAME_AUTH_RSP_VER_OFF         = 0x00;
    final static byte FRAME_AUTH_RSP_USR_OFF         = 0x04;
    final static byte FRAME_AUTH_RSP_ENC_OFF         = 0x05;
    final static byte FRAME_AUTH_RSP_SIZE_OFF        = 0x06;
    final static byte FRAME_AUTH_RSP_CHALLENGE_OFF   = 0x08;
    final static byte FRAME_AUTH_RSP_FIXED_SIZE      = 0x10;


    final static short ADMIN_CMD_BASE            = 0x0000;
    final static short USER_CMD_BASE             = 0x1000;

    final static short CMD_INVALID               = ADMIN_CMD_BASE;
    final static short CMD_INVALID_RSP           = CMD_INVALID + 1;

    final static short CMD_LIST_GLOBALS          = CMD_INVALID_RSP + 1;
    final static short CMD_LIST_GLOBALS_RSP      = CMD_LIST_GLOBALS + 1;

    final static short CMD_LIST_PROCEDURE        = CMD_LIST_GLOBALS_RSP + 1;
    final static short CMD_LIST_PROCEDURE_RSP    = CMD_LIST_PROCEDURE + 1;

    final static short CMD_DESC_PROC_PARAM       = CMD_LIST_PROCEDURE_RSP + 1;
    final static short CMD_DESC_PROC_PARAM_RSP   = CMD_DESC_PROC_PARAM + 1;

    final static short CMD_CLOSE_CONN            = USER_CMD_BASE;
    final static short CMD_CLOSE_CONN_RSP        = CMD_CLOSE_CONN + 1;

    final static short CMD_GLOBAL_DESC           = CMD_CLOSE_CONN_RSP + 1;
    final static short CMD_GLOBAL_DESC_RSP       = CMD_GLOBAL_DESC + 1;

    final static short CMD_READ_STACK            = CMD_GLOBAL_DESC_RSP + 1;
    final static short CMD_READ_STACK_RSP        = CMD_READ_STACK + 1;

    final static short CMD_UPDATE_STACK          = CMD_READ_STACK_RSP + 1;
    final static short CMD_UPDATE_STACK_RSP      = CMD_UPDATE_STACK + 1;

    final static byte CMD_UPDATE_FUNC_POP        = 1;
    final static byte CMD_UPDATE_FUNC_PUSH       = 2;
    final static byte CMD_UPDATE_FUNC_CHTOP      = 3;
    final static byte CMD_UPDATE_FUNC_TBL_ROWS   = 4;

    final static short CMD_EXEC_PROC             = CMD_UPDATE_STACK_RSP + 1;
    final static short CMD_EXEC_PROC_RSP         = CMD_EXEC_PROC + 1;

/* Ping command */
    final static short CMD_PING_SERVER           = CMD_EXEC_PROC_RSP + 1;
    final static short CMD_PING_SERVER_RSP       = CMD_PING_SERVER + 1;
}
