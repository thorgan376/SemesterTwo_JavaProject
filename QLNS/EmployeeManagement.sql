CREATE DATABASE EmployeeTransferManagement
USE [EmployeeTransferManagement]
GO
/****** Object:  Table [dbo].[Departments]    Script Date: 8/28/2021 5:11:34 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Departments](
	[DepartmentID] [int] IDENTITY(1,1) NOT NULL,
	[DepartmentName] [nvarchar](150) NULL,
 CONSTRAINT [PK_Departments] PRIMARY KEY CLUSTERED 
(
	[DepartmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Employees]    Script Date: 8/28/2021 5:11:34 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employees](
	[EmployeeID] [int] IDENTITY(1,1) NOT NULL,
	[EmployeeName] [nvarchar](100) NULL,
	[Username] [nvarchar](50) NULL,
	[Password] [nvarchar](100) NULL,
	[IsSystemAdmin] [bit] NULL,
	[RoleID] [int] NOT NULL,
	[ProjectID] [int] NOT NULL,
	[DepartmentID] [int] NOT NULL,
	[LocationID] [int] NOT NULL,
 CONSTRAINT [PK_Employees] PRIMARY KEY CLUSTERED 
(
	[EmployeeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Locations]    Script Date: 8/28/2021 5:11:34 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Locations](
	[LocationID] [int] IDENTITY(1,1) NOT NULL,
	[LocationName] [nvarchar](150) NULL,
	[LocationAllowance] [float] NULL,
 CONSTRAINT [PK_Locations] PRIMARY KEY CLUSTERED 
(
	[LocationID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Projects]    Script Date: 8/28/2021 5:11:34 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Projects](
	[ProjectID] [int] IDENTITY(1,1) NOT NULL,
	[ProjectName] [nvarchar](150) NULL,
 CONSTRAINT [PK_Projects] PRIMARY KEY CLUSTERED 
(
	[ProjectID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Roles]    Script Date: 8/28/2021 5:11:34 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Roles](
	[RoleID] [int] IDENTITY(1,1) NOT NULL,
	[RoleName] [nvarchar](150) NULL,
	[RoleAllowance] [float] NULL,
 CONSTRAINT [PK_Roles] PRIMARY KEY CLUSTERED 
(
	[RoleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Transfers]    Script Date: 8/28/2021 5:11:34 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Transfers](
	[TransferID] [int] IDENTITY(1,1) NOT NULL,
	[EmployeeID] [int] NOT NULL,
	[IsApproved] [bit] NULL,
	[Reason] [nvarchar](1000) NULL,
	[FromProjectID] [int] NOT NULL,
	[ToProjectID] [int] NOT NULL,
	[FromDepartmentID] [int] NOT NULL,
	[ToDepartmentID] [int] NOT NULL,
	[FromLocationID] [int] NOT NULL,
	[ToLocationID] [int] NOT NULL,
	[TransferRelievingDate] [datetime] NULL,
	[TransferJoiningDate] [datetime] NULL,
	[TotalAllowance] [float] NULL,
 CONSTRAINT [PK_Transfers] PRIMARY KEY CLUSTERED 
(
	[TransferID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Departments] ON 

INSERT [dbo].[Departments] ([DepartmentID], [DepartmentName]) VALUES (1, N'Accounting')
INSERT [dbo].[Departments] ([DepartmentID], [DepartmentName]) VALUES (2, N'Administrative Accounting')
INSERT [dbo].[Departments] ([DepartmentID], [DepartmentName]) VALUES (5, N'Import')
SET IDENTITY_INSERT [dbo].[Departments] OFF
SET IDENTITY_INSERT [dbo].[Employees] ON 

INSERT [dbo].[Employees] ([EmployeeID], [EmployeeName], [Username], [Password], [IsSystemAdmin], [RoleID], [ProjectID], [DepartmentID], [LocationID]) VALUES (1, N'A', N'a', N'123456', 1, 1, 2, 2, 1)
INSERT [dbo].[Employees] ([EmployeeID], [EmployeeName], [Username], [Password], [IsSystemAdmin], [RoleID], [ProjectID], [DepartmentID], [LocationID]) VALUES (2, N'B', N'b', N'123456', 0, 2, 4, 5, 4)
INSERT [dbo].[Employees] ([EmployeeID], [EmployeeName], [Username], [Password], [IsSystemAdmin], [RoleID], [ProjectID], [DepartmentID], [LocationID]) VALUES (14, N'Nguyen Van Phu', N'phu', N'123456', 1, 1, 2, 2, 1)
INSERT [dbo].[Employees] ([EmployeeID], [EmployeeName], [Username], [Password], [IsSystemAdmin], [RoleID], [ProjectID], [DepartmentID], [LocationID]) VALUES (15, N'Bui Ngoc Canh', N'canh', N'123456', 0, 2, 2, 2, 3)
SET IDENTITY_INSERT [dbo].[Employees] OFF
SET IDENTITY_INSERT [dbo].[Locations] ON 

INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (1, N'Hanoi', 300)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (2, N'HoaBinh', 120)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (3, N'NhaTrang', 550)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (4, N'ThaiBinh', 800)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (5, N'HaTay', 850)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (6, N'VinhPhuc', 515.2)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (7, N'New Dehli', 123.3)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (8, N'Ho Chi Minh City', 205)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (9, N'Hanoi', 300)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (10, N'Beijing', 120)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (11, N'Mumbai', 550)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (12, N'London', 800)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (13, N'New York', 850)
INSERT [dbo].[Locations] ([LocationID], [LocationName], [LocationAllowance]) VALUES (14, N'Moscow', 515.1)
SET IDENTITY_INSERT [dbo].[Locations] OFF
SET IDENTITY_INSERT [dbo].[Projects] ON 

INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (1, N'quanLySinhVien')
INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (2, N'KTX')
INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (3, N'ABC')
INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (4, N'sdfh')
INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (12, N'Quan Ly')
INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (14, N'phan tich nhu cau')
INSERT [dbo].[Projects] ([ProjectID], [ProjectName]) VALUES (15, N'ket noi khach hang')
SET IDENTITY_INSERT [dbo].[Projects] OFF
SET IDENTITY_INSERT [dbo].[Roles] ON 

INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (1, N'CEO', 1200)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (2, N'Chief Financial Officer', 1100)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (3, N'CIO', 1000)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (4, N'Manager', 900)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (5, N'Secretary', 800)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (6, N'Assist', 700)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (7, N'Security Guard', 600)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (9, N'New Roles', 129)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (10, N'admin', 1200)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (11, N'quan ly nhan su', 1000)
INSERT [dbo].[Roles] ([RoleID], [RoleName], [RoleAllowance]) VALUES (12, N'quan ly', 900)
SET IDENTITY_INSERT [dbo].[Roles] OFF
SET IDENTITY_INSERT [dbo].[Transfers] ON 

INSERT [dbo].[Transfers] ([TransferID], [EmployeeID], [IsApproved], [Reason], [FromProjectID], [ToProjectID], [FromDepartmentID], [ToDepartmentID], [FromLocationID], [ToLocationID], [TransferRelievingDate], [TransferJoiningDate], [TotalAllowance]) VALUES (10, 1, 1, N'chuyen den du an khac', 1, 2, 1, 2, 1, 2, CAST(N'2010-02-20 00:00:00.000' AS DateTime), CAST(N'2010-03-20 00:00:00.000' AS DateTime), 1520.3)
INSERT [dbo].[Transfers] ([TransferID], [EmployeeID], [IsApproved], [Reason], [FromProjectID], [ToProjectID], [FromDepartmentID], [ToDepartmentID], [FromLocationID], [ToLocationID], [TransferRelievingDate], [TransferJoiningDate], [TotalAllowance]) VALUES (11, 2, 1, N'di hoc lai', 3, 1, 2, 1, 1, 2, CAST(N'2010-11-12 00:00:00.000' AS DateTime), CAST(N'2010-11-11 00:00:00.000' AS DateTime), 1996.3)
SET IDENTITY_INSERT [dbo].[Transfers] OFF
ALTER TABLE [dbo].[Employees]  WITH CHECK ADD  CONSTRAINT [FK_Employees_Departments] FOREIGN KEY([DepartmentID])
REFERENCES [dbo].[Departments] ([DepartmentID])
GO
ALTER TABLE [dbo].[Employees] CHECK CONSTRAINT [FK_Employees_Departments]
GO
ALTER TABLE [dbo].[Employees]  WITH CHECK ADD  CONSTRAINT [FK_Employees_Locations] FOREIGN KEY([LocationID])
REFERENCES [dbo].[Locations] ([LocationID])
GO
ALTER TABLE [dbo].[Employees] CHECK CONSTRAINT [FK_Employees_Locations]
GO
ALTER TABLE [dbo].[Employees]  WITH CHECK ADD  CONSTRAINT [FK_Employees_Projects] FOREIGN KEY([ProjectID])
REFERENCES [dbo].[Projects] ([ProjectID])
GO
ALTER TABLE [dbo].[Employees] CHECK CONSTRAINT [FK_Employees_Projects]
GO
ALTER TABLE [dbo].[Employees]  WITH CHECK ADD  CONSTRAINT [FK_Employees_Roles] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Roles] ([RoleID])
GO
ALTER TABLE [dbo].[Employees] CHECK CONSTRAINT [FK_Employees_Roles]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Departments] FOREIGN KEY([ToDepartmentID])
REFERENCES [dbo].[Departments] ([DepartmentID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Departments]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Departments1] FOREIGN KEY([FromDepartmentID])
REFERENCES [dbo].[Departments] ([DepartmentID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Departments1]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Employees] FOREIGN KEY([EmployeeID])
REFERENCES [dbo].[Employees] ([EmployeeID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Employees]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Locations] FOREIGN KEY([FromLocationID])
REFERENCES [dbo].[Locations] ([LocationID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Locations]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Locations1] FOREIGN KEY([ToLocationID])
REFERENCES [dbo].[Locations] ([LocationID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Locations1]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Projects] FOREIGN KEY([FromProjectID])
REFERENCES [dbo].[Projects] ([ProjectID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Projects]
GO
ALTER TABLE [dbo].[Transfers]  WITH CHECK ADD  CONSTRAINT [FK_Transfers_Projects1] FOREIGN KEY([ToProjectID])
REFERENCES [dbo].[Projects] ([ProjectID])
GO
ALTER TABLE [dbo].[Transfers] CHECK CONSTRAINT [FK_Transfers_Projects1]
GO
